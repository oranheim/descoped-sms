/***************************************************************************
 * Copyright 2003-2004 Ove Ranheim         All rights reserved.  *
 * Please look at license.txt in info directory for more license detail.   *
 **************************************************************************/
package io.descoped.service.message.sms.encoder.impl;

import io.descoped.service.message.sms.common.ConvertException;
import io.descoped.service.message.sms.common.OperationNotSupported;
import io.descoped.service.message.sms.encoder.Formatter;
import io.descoped.service.message.sms.encoder.MessageFormat;


/**
 * @author: Ove Ranheim
 * @email: oranheim@descoped.io
 */
public class RawBinaryUDHFormatter implements Formatter {

    private static Formatter me;

    public RawBinaryUDHFormatter() {
    }

    public MessageFormat getFormat() {
        return MessageFormat.RAW_BINARY_UDH;
    }

    public Object convert(Object object) throws ConvertException {
        throw new OperationNotSupported("Not yet implemented!");
    }

    public static Formatter getInstance() {
        if (me == null) me = new RawBinaryUDHFormatter();
        return me;
    }

}

