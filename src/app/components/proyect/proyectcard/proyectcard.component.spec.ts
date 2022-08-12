import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ProyectcardComponent } from './proyectcard.component';

describe('ProyectcardComponent', () => {
  let component: ProyectcardComponent;
  let fixture: ComponentFixture<ProyectcardComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ProyectcardComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ProyectcardComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
