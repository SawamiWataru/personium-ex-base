/**
 * Personium
 * Copyright 2014 - 2017 FUJITSU LIMITED
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.personium.engine.extension.support;

import org.mozilla.javascript.EcmaError;
import org.mozilla.javascript.ScriptRuntime;

/**
 * Extension用例外作成クラス.
 */
public class ExtensionErrorConstructor {

    private ExtensionErrorConstructor() {
    }

    /**
     * エラーオブジェクトを生成する.
     * @param message エラーメッセージ
     * @return エラーオブジェクト
     */
    public static EcmaError construct(String message) {
        return ScriptRuntime.constructError("Error", message);
    }

}
