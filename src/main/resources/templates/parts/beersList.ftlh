<div class="row m-1 p-1">
    <#if beers??>

        <#list beers as beer>
            <div class="card text-center" style="height: auto; width: auto;">
                <div class="card-header">
                    <h4 class="card-title p-auto m-auto">${beer.tapNumber} кран</h4>
                </div>
                <div class="p-1 mb-1 card-body" >
                    <h6 class="p-1 mb-1 card-text">${beer.beerName}</h6>
                    <p <#if beer.beerStopped == true> class="p-1 mb-1 bg-danger text-white" </#if> class="card-text" >
                        ${beer.beerCost} руб./0.5 литра <BR>
                        ${beer.beerBalance} - в кеге <BR>
                        ${beer.beerStopped?string('НА СТОПЕ!', '')}</p>
                    <a href="/beerEdit/${beer.tapNumber}" class="btn btn-primary">Редактировать</a>
                </div>
            </div>
        </#list>
    </#if>
</div>