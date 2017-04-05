/*
 * #%L
 * GwtMaterial
 * %%
 * Copyright (C) 2015 - 2017 GwtMaterialDesign
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
package gwt.material.design.test.client.application;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;
import gwt.material.design.addins.client.combobox.MaterialComboBox;
import gwt.material.design.client.constants.SideNavType;
import gwt.material.design.client.ui.*;
import gwt.material.design.test.client.application.service.Car;
import gwt.material.design.test.client.application.service.CarServiceAsync;
import gwt.material.design.test.client.application.service.FakeCarService;

import javax.inject.Inject;
import java.util.Date;

public class ApplicationView extends ViewImpl implements ApplicationPresenter.MyView {
    interface Binder extends UiBinder<Widget, ApplicationView> {
    }

    @UiField
    MaterialComboBox<String> combo;

    @UiField
    MaterialSideNav sideNav;

    @UiField
    MaterialHeader header;

    @Inject
    ApplicationView(
            Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
    }
}
