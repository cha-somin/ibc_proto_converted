// source: cosmos/tx/v1beta1/tx.proto
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

goog.provide('proto.cosmos.tx.v1beta1.TxBody');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.google.protobuf.Any');

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
proto.cosmos.tx.v1beta1.TxBody = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, 500, proto.cosmos.tx.v1beta1.TxBody.repeatedFields_, null);
};
goog.inherits(proto.cosmos.tx.v1beta1.TxBody, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.cosmos.tx.v1beta1.TxBody.displayName = 'proto.cosmos.tx.v1beta1.TxBody';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.cosmos.tx.v1beta1.TxBody.repeatedFields_ = [1,1023,2047];



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
proto.cosmos.tx.v1beta1.TxBody.prototype.toObject = function(opt_includeInstance) {
  return proto.cosmos.tx.v1beta1.TxBody.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.cosmos.tx.v1beta1.TxBody} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cosmos.tx.v1beta1.TxBody.toObject = function(includeInstance, msg) {
  var f, obj = {
    messagesList: jspb.Message.toObjectList(msg.getMessagesList(),
    proto.google.protobuf.Any.toObject, includeInstance),
    memo: jspb.Message.getFieldWithDefault(msg, 2, ""),
    timeoutHeight: jspb.Message.getFieldWithDefault(msg, 3, 0),
    extensionOptionsList: jspb.Message.toObjectList(msg.getExtensionOptionsList(),
    proto.google.protobuf.Any.toObject, includeInstance),
    nonCriticalExtensionOptionsList: jspb.Message.toObjectList(msg.getNonCriticalExtensionOptionsList(),
    proto.google.protobuf.Any.toObject, includeInstance)
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
 * @return {!proto.cosmos.tx.v1beta1.TxBody}
 */
proto.cosmos.tx.v1beta1.TxBody.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.cosmos.tx.v1beta1.TxBody;
  return proto.cosmos.tx.v1beta1.TxBody.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.cosmos.tx.v1beta1.TxBody} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.cosmos.tx.v1beta1.TxBody}
 */
proto.cosmos.tx.v1beta1.TxBody.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.google.protobuf.Any;
      reader.readMessage(value,proto.google.protobuf.Any.deserializeBinaryFromReader);
      msg.addMessages(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setMemo(value);
      break;
    case 3:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setTimeoutHeight(value);
      break;
    case 1023:
      var value = new proto.google.protobuf.Any;
      reader.readMessage(value,proto.google.protobuf.Any.deserializeBinaryFromReader);
      msg.addExtensionOptions(value);
      break;
    case 2047:
      var value = new proto.google.protobuf.Any;
      reader.readMessage(value,proto.google.protobuf.Any.deserializeBinaryFromReader);
      msg.addNonCriticalExtensionOptions(value);
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
proto.cosmos.tx.v1beta1.TxBody.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.cosmos.tx.v1beta1.TxBody.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.cosmos.tx.v1beta1.TxBody} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cosmos.tx.v1beta1.TxBody.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getMessagesList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      1,
      f,
      proto.google.protobuf.Any.serializeBinaryToWriter
    );
  }
  f = message.getMemo();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getTimeoutHeight();
  if (f !== 0) {
    writer.writeUint64(
      3,
      f
    );
  }
  f = message.getExtensionOptionsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      1023,
      f,
      proto.google.protobuf.Any.serializeBinaryToWriter
    );
  }
  f = message.getNonCriticalExtensionOptionsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      2047,
      f,
      proto.google.protobuf.Any.serializeBinaryToWriter
    );
  }
};


/**
 * repeated google.protobuf.Any messages = 1;
 * @return {!Array<!proto.google.protobuf.Any>}
 */
proto.cosmos.tx.v1beta1.TxBody.prototype.getMessagesList = function() {
  return /** @type{!Array<!proto.google.protobuf.Any>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.google.protobuf.Any, 1));
};


/**
 * @param {!Array<!proto.google.protobuf.Any>} value
 * @return {!proto.cosmos.tx.v1beta1.TxBody} returns this
*/
proto.cosmos.tx.v1beta1.TxBody.prototype.setMessagesList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 1, value);
};


/**
 * @param {!proto.google.protobuf.Any=} opt_value
 * @param {number=} opt_index
 * @return {!proto.google.protobuf.Any}
 */
proto.cosmos.tx.v1beta1.TxBody.prototype.addMessages = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 1, opt_value, proto.google.protobuf.Any, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.cosmos.tx.v1beta1.TxBody} returns this
 */
proto.cosmos.tx.v1beta1.TxBody.prototype.clearMessagesList = function() {
  return this.setMessagesList([]);
};


/**
 * optional string memo = 2;
 * @return {string}
 */
proto.cosmos.tx.v1beta1.TxBody.prototype.getMemo = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.cosmos.tx.v1beta1.TxBody} returns this
 */
proto.cosmos.tx.v1beta1.TxBody.prototype.setMemo = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional uint64 timeout_height = 3;
 * @return {number}
 */
proto.cosmos.tx.v1beta1.TxBody.prototype.getTimeoutHeight = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 3, 0));
};


/**
 * @param {number} value
 * @return {!proto.cosmos.tx.v1beta1.TxBody} returns this
 */
proto.cosmos.tx.v1beta1.TxBody.prototype.setTimeoutHeight = function(value) {
  return jspb.Message.setProto3IntField(this, 3, value);
};


/**
 * repeated google.protobuf.Any extension_options = 1023;
 * @return {!Array<!proto.google.protobuf.Any>}
 */
proto.cosmos.tx.v1beta1.TxBody.prototype.getExtensionOptionsList = function() {
  return /** @type{!Array<!proto.google.protobuf.Any>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.google.protobuf.Any, 1023));
};


/**
 * @param {!Array<!proto.google.protobuf.Any>} value
 * @return {!proto.cosmos.tx.v1beta1.TxBody} returns this
*/
proto.cosmos.tx.v1beta1.TxBody.prototype.setExtensionOptionsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 1023, value);
};


/**
 * @param {!proto.google.protobuf.Any=} opt_value
 * @param {number=} opt_index
 * @return {!proto.google.protobuf.Any}
 */
proto.cosmos.tx.v1beta1.TxBody.prototype.addExtensionOptions = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 1023, opt_value, proto.google.protobuf.Any, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.cosmos.tx.v1beta1.TxBody} returns this
 */
proto.cosmos.tx.v1beta1.TxBody.prototype.clearExtensionOptionsList = function() {
  return this.setExtensionOptionsList([]);
};


/**
 * repeated google.protobuf.Any non_critical_extension_options = 2047;
 * @return {!Array<!proto.google.protobuf.Any>}
 */
proto.cosmos.tx.v1beta1.TxBody.prototype.getNonCriticalExtensionOptionsList = function() {
  return /** @type{!Array<!proto.google.protobuf.Any>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.google.protobuf.Any, 2047));
};


/**
 * @param {!Array<!proto.google.protobuf.Any>} value
 * @return {!proto.cosmos.tx.v1beta1.TxBody} returns this
*/
proto.cosmos.tx.v1beta1.TxBody.prototype.setNonCriticalExtensionOptionsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 2047, value);
};


/**
 * @param {!proto.google.protobuf.Any=} opt_value
 * @param {number=} opt_index
 * @return {!proto.google.protobuf.Any}
 */
proto.cosmos.tx.v1beta1.TxBody.prototype.addNonCriticalExtensionOptions = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 2047, opt_value, proto.google.protobuf.Any, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.cosmos.tx.v1beta1.TxBody} returns this
 */
proto.cosmos.tx.v1beta1.TxBody.prototype.clearNonCriticalExtensionOptionsList = function() {
  return this.setNonCriticalExtensionOptionsList([]);
};


