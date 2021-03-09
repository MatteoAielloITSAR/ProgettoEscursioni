import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CreazionePostComponent } from './creazione-post.component';

describe('CreazionePostComponent', () => {
  let component: CreazionePostComponent;
  let fixture: ComponentFixture<CreazionePostComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CreazionePostComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CreazionePostComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
