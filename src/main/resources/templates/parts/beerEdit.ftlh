<#import "common.ftlh" as c>

<@c.page>

    <form action="/beerEdit/${beer}" method="post">
        <div class="form-row align-items-center m-1 p-1">
            <input type="hidden" name="tapNumber" value="<#if beer??>${beer.tapNumber}</#if>"/>
            <div class="col-auto">
                <label class="sr-only" for="beerName">beerName</label>
                <input type="text" name="beerName" value="<#if beer??>${beer.beerName}</#if>" class="form-control mb-2" id="beerName" placeholder="Наименование пива"/>
            </div>
            <div class="col-auto">
                <label class="sr-only" for="beerCost">beerCost</label>
                <input type="text" name="beerCost" value="<#if beer??>${beer.beerCost}</#if>" class="form-control mb-2" id="beerCost" placeholder="Cтоимость за 0.5 л"/>
            </div>
            <div class="col-auto">
                <label class="sr-only" for="beerBalance">beerBalance</label>
                <input type="text" name="beerBalance" value="<#if beer??>${beer.beerBalance}</#if>" class="form-control mb-2" id="beerBalance" placeholder="Литраж кеги"/>
            </div>
            <div class="col-auto">
                <div class="form-check mb-2">
                    <input class="form-check-input" type="checkbox" name="beerStopped" ${beer.beerStopped?string("checked", "")} id="beerStopped"/>
                    <label class="form-check-label" for="beerStopped">
                        На стопе?
                    </label>
                </div>
            </div>
            <div class="col-auto">
                <button type="submit" class="btn btn-primary mb-2">Сохранить</button>
            </div>
        </div>
    </form>

</@c.page>