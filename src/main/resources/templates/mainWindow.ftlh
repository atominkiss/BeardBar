<#import "parts/common.ftlh" as c>
<#--<#import "parts/beersList.ftlh" as beerList>-->
<#--<#import "parts/snacksList.ftlh" as s>-->

<@c.page>

<#--                        <#include "parts/beersList.ftlh"/>-->

<#--                            <#include "parts/snacksList.ftlh"/>-->



    <div class="accordion" id="accordionExample">
        <div class="card">
            <div class="card-header " id="headingOne">
                <h2 class="mb-0">
                    <button class="btn btn-link collapsed" type="button" data-toggle="collapse" data-target="#collapseOne" aria-expanded="false" aria-controls="collapseOne">
                        Список кранов
                    </button>
                </h2>
            </div>
            <div id="collapseOne" class="collapse" aria-labelledby="headingOne" data-parent="#accordionExample">
                <div class="card-body">
                    <a class="btn btn-success" href="/beers" role="button">Добавить кран</a>
                    <div>
                        <#include "parts/beersList.ftlh"/>
                    </div>
                </div>
            </div>
        </div>

        <div class="card">
            <div class="card-header" id="headingTwo">
                <h2 class="mb-0">
                    <button class="btn btn-link collapsed" type="button" data-toggle="collapse" data-target="#collapseTwo" aria-expanded="false" aria-controls="collapseTwo">
                        Снэки / Кухня
                    </button>
                </h2>
            </div>
            <div id="collapseTwo" class="collapse" aria-labelledby="headingTwo" data-parent="#accordionExample">
                <div class="card-body">
                    <a class="btn btn-success" href="/snacks" role="button">Добавить снэк</a>
                    <div>
<#--                        <#include "parts/snacksList.ftlh"/>-->
                    </div>
                </div>
            </div>
        </div>
        <div class="card">
            <div class="card-header" id="headingThree">
                <h2 class="mb-0">
                    <button class="btn btn-link" type="button" data-toggle="collapse" data-target="#collapseThree" aria-expanded="true" aria-controls="collapseThree">
                        Гости
                    </button>
                </h2>
            </div>
            <div id="collapseThree" class="collapse show" aria-labelledby="headingThree" data-parent="#accordionExample">
                <div class="card-body">
                    <a class="btn btn-success" href="/orders" role="button">Список гостей</a>
                    <div>

                    </div>
                </div>
            </div>
        </div>
    </div>

</@c.page>