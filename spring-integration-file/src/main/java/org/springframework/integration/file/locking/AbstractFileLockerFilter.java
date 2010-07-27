/*
 * Copyright 2002-2008 the original author or authors.
 *
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
 */

package org.springframework.integration.file.locking;

import org.springframework.integration.file.AbstractFileListFilter;
import org.springframework.integration.file.FileLocker;

import java.io.File;

/**
 * Convenience base class for implementing FileLockers that check a lock before accepting a file. This is needed
 * when used in combination with a FileReadingMessageSource through a DirectoryScanner.
 *
 * @author Iwein Fuld
 * @since 2.0
 *
 */
public abstract class AbstractFileLockerFilter extends AbstractFileListFilter implements FileLocker {

    protected final boolean accept(File file) {
        return isLockable(file);
    }
}