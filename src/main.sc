theme: /

    state: start
        q!: * *start
        a: Привет
        buttons:
            "Искать" -> /searchVacancies
    
    state: searchVacancies
        a: Давай поищем
        intent: /test || toState=/searchFromString, onlyThisState = true
#        go!: /searchVacancies/region
            
        state: region
            q: давай
            a: Где ищем?
            
            state: text
                q: Москва
                a: Ищем в Москве

    state: searchFromString
        a: Попали в интент

    state: Fallback
        event!: noMatch
        a: Вы сказали: {{$parseTree.text}}
