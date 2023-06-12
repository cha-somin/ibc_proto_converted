// source: desmos/profiles/v1beta1/models_app_links.proto
/**
 * @fileoverview
 * @enhanceable
 * @suppress {missingRequire} reports error on implicit type usages.
 * @suppress {messageConventions} JS Compiler reports an error if a variable or
 *     field starts with 'MSG_' and isn't a translatable message.
 * @public
 */
// GENERATED CODE -- DO NOT EDIT!
/* eslint-disable */
// @ts-nocheck

goog.provide('proto.desmos.profiles.v1beta1.Result');
goog.provide('proto.desmos.profiles.v1beta1.Result.Failed');
goog.provide('proto.desmos.profiles.v1beta1.Result.Success');
goog.provide('proto.desmos.profiles.v1beta1.Result.SumCase');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');

/**
 * Generated by JsPbCodeGenerator.
 * @param {Array=} opt_data Optional initial data array, typically from a
 * server response, or constructed directly in Javascript. The array is used
 * in place and becomes part of the constructed object. It is not cloned.
 * If no data is provided, the constructed object will be empty, but still
 * valid.
 * @extends {jspb.Message}
 * @constructor
 */
proto.desmos.profiles.v1beta1.Result = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, proto.desmos.profiles.v1beta1.Result.oneofGroups_);
};
goog.inherits(proto.desmos.profiles.v1beta1.Result, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.desmos.profiles.v1beta1.Result.displayName = 'proto.desmos.profiles.v1beta1.Result';
}
/**
 * Generated by JsPbCodeGenerator.
 * @param {Array=} opt_data Optional initial data array, typically from a
 * server response, or constructed directly in Javascript. The array is used
 * in place and becomes part of the constructed object. It is not cloned.
 * If no data is provided, the constructed object will be empty, but still
 * valid.
 * @extends {jspb.Message}
 * @constructor
 */
proto.desmos.profiles.v1beta1.Result.Success = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.desmos.profiles.v1beta1.Result.Success, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.desmos.profiles.v1beta1.Result.Success.displayName = 'proto.desmos.profiles.v1beta1.Result.Success';
}
/**
 * Generated by JsPbCodeGenerator.
 * @param {Array=} opt_data Optional initial data array, typically from a
 * server response, or constructed directly in Javascript. The array is used
 * in place and becomes part of the constructed object. It is not cloned.
 * If no data is provided, the constructed object will be empty, but still
 * valid.
 * @extends {jspb.Message}
 * @constructor
 */
proto.desmos.profiles.v1beta1.Result.Failed = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.desmos.profiles.v1beta1.Result.Failed, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.desmos.profiles.v1beta1.Result.Failed.displayName = 'proto.desmos.profiles.v1beta1.Result.Failed';
}

/**
 * Oneof group definitions for this message. Each group defines the field
 * numbers belonging to that group. When of these fields' value is set, all
 * other fields in the group are cleared. During deserialization, if multiple
 * fields are encountered for a group, only the last value seen will be kept.
 * @private {!Array<!Array<number>>}
 * @const
 */
proto.desmos.profiles.v1beta1.Result.oneofGroups_ = [[1,2]];

/**
 * @enum {number}
 */
proto.desmos.profiles.v1beta1.Result.SumCase = {
  SUM_NOT_SET: 0,
  SUCCESS: 1,
  FAILED: 2
};

/**
 * @return {proto.desmos.profiles.v1beta1.Result.SumCase}
 */
proto.desmos.profiles.v1beta1.Result.prototype.getSumCase = function() {
  return /** @type {proto.desmos.profiles.v1beta1.Result.SumCase} */(jspb.Message.computeOneofCase(this, proto.desmos.profiles.v1beta1.Result.oneofGroups_[0]));
};



if (jspb.Message.GENERATE_TO_OBJECT) {
/**
 * Creates an object representation of this proto.
 * Field names that are reserved in JavaScript and will be renamed to pb_name.
 * Optional fields that are not set will be set to undefined.
 * To access a reserved field use, foo.pb_<name>, eg, foo.pb_default.
 * For the list of reserved names please see:
 *     net/proto2/compiler/js/internal/generator.cc#kKeyword.
 * @param {boolean=} opt_includeInstance Deprecated. whether to include the
 *     JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @return {!Object}
 */
proto.desmos.profiles.v1beta1.Result.prototype.toObject = function(opt_includeInstance) {
  return proto.desmos.profiles.v1beta1.Result.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.desmos.profiles.v1beta1.Result} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.desmos.profiles.v1beta1.Result.toObject = function(includeInstance, msg) {
  var f, obj = {
    success: (f = msg.getSuccess()) && proto.desmos.profiles.v1beta1.Result.Success.toObject(includeInstance, f),
    failed: (f = msg.getFailed()) && proto.desmos.profiles.v1beta1.Result.Failed.toObject(includeInstance, f)
  };

  if (includeInstance) {
    obj.$jspbMessageInstance = msg;
  }
  return obj;
};
}


/**
 * Deserializes binary data (in protobuf wire format).
 * @param {jspb.ByteSource} bytes The bytes to deserialize.
 * @return {!proto.desmos.profiles.v1beta1.Result}
 */
proto.desmos.profiles.v1beta1.Result.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.desmos.profiles.v1beta1.Result;
  return proto.desmos.profiles.v1beta1.Result.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.desmos.profiles.v1beta1.Result} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.desmos.profiles.v1beta1.Result}
 */
proto.desmos.profiles.v1beta1.Result.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.desmos.profiles.v1beta1.Result.Success;
      reader.readMessage(value,proto.desmos.profiles.v1beta1.Result.Success.deserializeBinaryFromReader);
      msg.setSuccess(value);
      break;
    case 2:
      var value = new proto.desmos.profiles.v1beta1.Result.Failed;
      reader.readMessage(value,proto.desmos.profiles.v1beta1.Result.Failed.deserializeBinaryFromReader);
      msg.setFailed(value);
      break;
    default:
      reader.skipField();
      break;
    }
  }
  return msg;
};


/**
 * Serializes the message to binary data (in protobuf wire format).
 * @return {!Uint8Array}
 */
proto.desmos.profiles.v1beta1.Result.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.desmos.profiles.v1beta1.Result.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.desmos.profiles.v1beta1.Result} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.desmos.profiles.v1beta1.Result.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getSuccess();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.desmos.profiles.v1beta1.Result.Success.serializeBinaryToWriter
    );
  }
  f = message.getFailed();
  if (f != null) {
    writer.writeMessage(
      2,
      f,
      proto.desmos.profiles.v1beta1.Result.Failed.serializeBinaryToWriter
    );
  }
};





if (jspb.Message.GENERATE_TO_OBJECT) {
/**
 * Creates an object representation of this proto.
 * Field names that are reserved in JavaScript and will be renamed to pb_name.
 * Optional fields that are not set will be set to undefined.
 * To access a reserved field use, foo.pb_<name>, eg, foo.pb_default.
 * For the list of reserved names please see:
 *     net/proto2/compiler/js/internal/generator.cc#kKeyword.
 * @param {boolean=} opt_includeInstance Deprecated. whether to include the
 *     JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @return {!Object}
 */
proto.desmos.profiles.v1beta1.Result.Success.prototype.toObject = function(opt_includeInstance) {
  return proto.desmos.profiles.v1beta1.Result.Success.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.desmos.profiles.v1beta1.Result.Success} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.desmos.profiles.v1beta1.Result.Success.toObject = function(includeInstance, msg) {
  var f, obj = {
    value: jspb.Message.getFieldWithDefault(msg, 1, ""),
    signature: jspb.Message.getFieldWithDefault(msg, 2, "")
  };

  if (includeInstance) {
    obj.$jspbMessageInstance = msg;
  }
  return obj;
};
}


/**
 * Deserializes binary data (in protobuf wire format).
 * @param {jspb.ByteSource} bytes The bytes to deserialize.
 * @return {!proto.desmos.profiles.v1beta1.Result.Success}
 */
proto.desmos.profiles.v1beta1.Result.Success.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.desmos.profiles.v1beta1.Result.Success;
  return proto.desmos.profiles.v1beta1.Result.Success.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.desmos.profiles.v1beta1.Result.Success} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.desmos.profiles.v1beta1.Result.Success}
 */
proto.desmos.profiles.v1beta1.Result.Success.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setValue(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setSignature(value);
      break;
    default:
      reader.skipField();
      break;
    }
  }
  return msg;
};


/**
 * Serializes the message to binary data (in protobuf wire format).
 * @return {!Uint8Array}
 */
proto.desmos.profiles.v1beta1.Result.Success.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.desmos.profiles.v1beta1.Result.Success.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.desmos.profiles.v1beta1.Result.Success} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.desmos.profiles.v1beta1.Result.Success.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getValue();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getSignature();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
};


/**
 * optional string value = 1;
 * @return {string}
 */
proto.desmos.profiles.v1beta1.Result.Success.prototype.getValue = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.desmos.profiles.v1beta1.Result.Success} returns this
 */
proto.desmos.profiles.v1beta1.Result.Success.prototype.setValue = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string signature = 2;
 * @return {string}
 */
proto.desmos.profiles.v1beta1.Result.Success.prototype.getSignature = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.desmos.profiles.v1beta1.Result.Success} returns this
 */
proto.desmos.profiles.v1beta1.Result.Success.prototype.setSignature = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};





if (jspb.Message.GENERATE_TO_OBJECT) {
/**
 * Creates an object representation of this proto.
 * Field names that are reserved in JavaScript and will be renamed to pb_name.
 * Optional fields that are not set will be set to undefined.
 * To access a reserved field use, foo.pb_<name>, eg, foo.pb_default.
 * For the list of reserved names please see:
 *     net/proto2/compiler/js/internal/generator.cc#kKeyword.
 * @param {boolean=} opt_includeInstance Deprecated. whether to include the
 *     JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @return {!Object}
 */
proto.desmos.profiles.v1beta1.Result.Failed.prototype.toObject = function(opt_includeInstance) {
  return proto.desmos.profiles.v1beta1.Result.Failed.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.desmos.profiles.v1beta1.Result.Failed} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.desmos.profiles.v1beta1.Result.Failed.toObject = function(includeInstance, msg) {
  var f, obj = {
    error: jspb.Message.getFieldWithDefault(msg, 1, "")
  };

  if (includeInstance) {
    obj.$jspbMessageInstance = msg;
  }
  return obj;
};
}


/**
 * Deserializes binary data (in protobuf wire format).
 * @param {jspb.ByteSource} bytes The bytes to deserialize.
 * @return {!proto.desmos.profiles.v1beta1.Result.Failed}
 */
proto.desmos.profiles.v1beta1.Result.Failed.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.desmos.profiles.v1beta1.Result.Failed;
  return proto.desmos.profiles.v1beta1.Result.Failed.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.desmos.profiles.v1beta1.Result.Failed} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.desmos.profiles.v1beta1.Result.Failed}
 */
proto.desmos.profiles.v1beta1.Result.Failed.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setError(value);
      break;
    default:
      reader.skipField();
      break;
    }
  }
  return msg;
};


/**
 * Serializes the message to binary data (in protobuf wire format).
 * @return {!Uint8Array}
 */
proto.desmos.profiles.v1beta1.Result.Failed.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.desmos.profiles.v1beta1.Result.Failed.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.desmos.profiles.v1beta1.Result.Failed} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.desmos.profiles.v1beta1.Result.Failed.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getError();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
};


/**
 * optional string error = 1;
 * @return {string}
 */
proto.desmos.profiles.v1beta1.Result.Failed.prototype.getError = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.desmos.profiles.v1beta1.Result.Failed} returns this
 */
proto.desmos.profiles.v1beta1.Result.Failed.prototype.setError = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional Success success = 1;
 * @return {?proto.desmos.profiles.v1beta1.Result.Success}
 */
proto.desmos.profiles.v1beta1.Result.prototype.getSuccess = function() {
  return /** @type{?proto.desmos.profiles.v1beta1.Result.Success} */ (
    jspb.Message.getWrapperField(this, proto.desmos.profiles.v1beta1.Result.Success, 1));
};


/**
 * @param {?proto.desmos.profiles.v1beta1.Result.Success|undefined} value
 * @return {!proto.desmos.profiles.v1beta1.Result} returns this
*/
proto.desmos.profiles.v1beta1.Result.prototype.setSuccess = function(value) {
  return jspb.Message.setOneofWrapperField(this, 1, proto.desmos.profiles.v1beta1.Result.oneofGroups_[0], value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.desmos.profiles.v1beta1.Result} returns this
 */
proto.desmos.profiles.v1beta1.Result.prototype.clearSuccess = function() {
  return this.setSuccess(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.desmos.profiles.v1beta1.Result.prototype.hasSuccess = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * optional Failed failed = 2;
 * @return {?proto.desmos.profiles.v1beta1.Result.Failed}
 */
proto.desmos.profiles.v1beta1.Result.prototype.getFailed = function() {
  return /** @type{?proto.desmos.profiles.v1beta1.Result.Failed} */ (
    jspb.Message.getWrapperField(this, proto.desmos.profiles.v1beta1.Result.Failed, 2));
};


/**
 * @param {?proto.desmos.profiles.v1beta1.Result.Failed|undefined} value
 * @return {!proto.desmos.profiles.v1beta1.Result} returns this
*/
proto.desmos.profiles.v1beta1.Result.prototype.setFailed = function(value) {
  return jspb.Message.setOneofWrapperField(this, 2, proto.desmos.profiles.v1beta1.Result.oneofGroups_[0], value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.desmos.profiles.v1beta1.Result} returns this
 */
proto.desmos.profiles.v1beta1.Result.prototype.clearFailed = function() {
  return this.setFailed(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.desmos.profiles.v1beta1.Result.prototype.hasFailed = function() {
  return jspb.Message.getField(this, 2) != null;
};


