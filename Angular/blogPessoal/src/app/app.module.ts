import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FontAwesomeModule } from '@fortawesome/angular-fontawesome';
import { FooterComponent } from './footer/footer.component';
import { MenuComponent } from './menu/menu.component';
import { LoginComponent } from './login/login.component';
import { SubscribeComponent } from './subscribe/subscribe.component';

@NgModule({
  declarations: [
    AppComponent,
    FooterComponent,
    MenuComponent,
    LoginComponent,
    SubscribeComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FontAwesomeModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
