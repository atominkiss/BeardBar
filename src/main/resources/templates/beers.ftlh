<#import "parts/common.ftlh" as c>
<#--<#import "parts/beersList.ftlh" as beerList>-->

<@c.page>

    <form action="/beers" method="post">
        <div class="form-row align-items-center m-1 p-1">
            <div class="col-auto">
                <label class="sr-only" for="tapNumber">tapNumber</label>
                <input type="text" name="tapNumber" class="form-control mb-2" id="tapNumber" placeholder="Номер крана">
            </div>
            <div class="col-auto">
                <label class="sr-only" for="beerName">beerName</label>
                <input type="text" name="beerName" class="form-control mb-2" id="beerName" placeholder="Наименование пива">
            </div>
            <div class="col-auto">
                <label class="sr-only" for="beerCost">beerCost</label>
                <input type="text" name="beerCost" class="form-control mb-2" id="beerCost" placeholder="Cтоимость за 0.5 л">
            </div>
            <div class="col-auto">
                <label class="sr-only" for="beerBalance">beerBalance</label>
                <input type="text" name="beerBalance" class="form-control mb-2" id="beerBalance" placeholder="Литраж кеги">
            </div>
            <div class="col-auto">
                <div class="form-check mb-2">
                    <input class="form-check-input" type="checkbox" name="beerStopped" id="beerStopped">
                    <label class="form-check-label" for="beerStopped">
                        На стопе?
                    </label>
                </div>
            </div>
            <div class="col-auto">
                <button type="submit" class="btn btn-primary mb-2">Добавить кран</button>
<#--                <#include "parts/href_to_mainWindow.ftlh"/>-->
            </div>
        </div>
    </form>

    <div>Список кранов</div>

<#--    <#include "parts/beersList.ftlh"/>-->

</@c.page>