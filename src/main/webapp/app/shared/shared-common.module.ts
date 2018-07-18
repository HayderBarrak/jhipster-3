import { NgModule } from '@angular/core';

import { Jhipster3SharedLibsModule, JhiAlertComponent, JhiAlertErrorComponent } from './';

@NgModule({
    imports: [Jhipster3SharedLibsModule],
    declarations: [JhiAlertComponent, JhiAlertErrorComponent],
    exports: [Jhipster3SharedLibsModule, JhiAlertComponent, JhiAlertErrorComponent]
})
export class Jhipster3SharedCommonModule {}
