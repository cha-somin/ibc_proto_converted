// source: regen/ecocredit/v1alpha2/types.proto
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

goog.provide('proto.regen.ecocredit.v1alpha2.BatchInfo');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.google.protobuf.Timestamp');

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
proto.regen.ecocredit.v1alpha2.BatchInfo = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.regen.ecocredit.v1alpha2.BatchInfo, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.regen.ecocredit.v1alpha2.BatchInfo.displayName = 'proto.regen.ecocredit.v1alpha2.BatchInfo';
}



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
proto.regen.ecocredit.v1alpha2.BatchInfo.prototype.toObject = function(opt_includeInstance) {
  return proto.regen.ecocredit.v1alpha2.BatchInfo.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.regen.ecocredit.v1alpha2.BatchInfo} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.regen.ecocredit.v1alpha2.BatchInfo.toObject = function(includeInstance, msg) {
  var f, obj = {
    projectId: jspb.Message.getFieldWithDefault(msg, 1, ""),
    batchDenom: jspb.Message.getFieldWithDefault(msg, 2, ""),
    totalAmount: jspb.Message.getFieldWithDefault(msg, 4, ""),
    metadata: msg.getMetadata_asB64(),
    amountCancelled: jspb.Message.getFieldWithDefault(msg, 6, ""),
    startDate: (f = msg.getStartDate()) && proto.google.protobuf.Timestamp.toObject(includeInstance, f),
    endDate: (f = msg.getEndDate()) && proto.google.protobuf.Timestamp.toObject(includeInstance, f)
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
 * @return {!proto.regen.ecocredit.v1alpha2.BatchInfo}
 */
proto.regen.ecocredit.v1alpha2.BatchInfo.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.regen.ecocredit.v1alpha2.BatchInfo;
  return proto.regen.ecocredit.v1alpha2.BatchInfo.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.regen.ecocredit.v1alpha2.BatchInfo} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.regen.ecocredit.v1alpha2.BatchInfo}
 */
proto.regen.ecocredit.v1alpha2.BatchInfo.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setProjectId(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setBatchDenom(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.setTotalAmount(value);
      break;
    case 5:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setMetadata(value);
      break;
    case 6:
      var value = /** @type {string} */ (reader.readString());
      msg.setAmountCancelled(value);
      break;
    case 7:
      var value = new proto.google.protobuf.Timestamp;
      reader.readMessage(value,proto.google.protobuf.Timestamp.deserializeBinaryFromReader);
      msg.setStartDate(value);
      break;
    case 8:
      var value = new proto.google.protobuf.Timestamp;
      reader.readMessage(value,proto.google.protobuf.Timestamp.deserializeBinaryFromReader);
      msg.setEndDate(value);
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
proto.regen.ecocredit.v1alpha2.BatchInfo.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.regen.ecocredit.v1alpha2.BatchInfo.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.regen.ecocredit.v1alpha2.BatchInfo} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.regen.ecocredit.v1alpha2.BatchInfo.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getProjectId();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getBatchDenom();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getTotalAmount();
  if (f.length > 0) {
    writer.writeString(
      4,
      f
    );
  }
  f = message.getMetadata_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      5,
      f
    );
  }
  f = message.getAmountCancelled();
  if (f.length > 0) {
    writer.writeString(
      6,
      f
    );
  }
  f = message.getStartDate();
  if (f != null) {
    writer.writeMessage(
      7,
      f,
      proto.google.protobuf.Timestamp.serializeBinaryToWriter
    );
  }
  f = message.getEndDate();
  if (f != null) {
    writer.writeMessage(
      8,
      f,
      proto.google.protobuf.Timestamp.serializeBinaryToWriter
    );
  }
};


/**
 * optional string project_id = 1;
 * @return {string}
 */
proto.regen.ecocredit.v1alpha2.BatchInfo.prototype.getProjectId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.regen.ecocredit.v1alpha2.BatchInfo} returns this
 */
proto.regen.ecocredit.v1alpha2.BatchInfo.prototype.setProjectId = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string batch_denom = 2;
 * @return {string}
 */
proto.regen.ecocredit.v1alpha2.BatchInfo.prototype.getBatchDenom = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.regen.ecocredit.v1alpha2.BatchInfo} returns this
 */
proto.regen.ecocredit.v1alpha2.BatchInfo.prototype.setBatchDenom = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional string total_amount = 4;
 * @return {string}
 */
proto.regen.ecocredit.v1alpha2.BatchInfo.prototype.getTotalAmount = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * @param {string} value
 * @return {!proto.regen.ecocredit.v1alpha2.BatchInfo} returns this
 */
proto.regen.ecocredit.v1alpha2.BatchInfo.prototype.setTotalAmount = function(value) {
  return jspb.Message.setProto3StringField(this, 4, value);
};


/**
 * optional bytes metadata = 5;
 * @return {string}
 */
proto.regen.ecocredit.v1alpha2.BatchInfo.prototype.getMetadata = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 5, ""));
};


/**
 * optional bytes metadata = 5;
 * This is a type-conversion wrapper around `getMetadata()`
 * @return {string}
 */
proto.regen.ecocredit.v1alpha2.BatchInfo.prototype.getMetadata_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getMetadata()));
};


/**
 * optional bytes metadata = 5;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getMetadata()`
 * @return {!Uint8Array}
 */
proto.regen.ecocredit.v1alpha2.BatchInfo.prototype.getMetadata_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getMetadata()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.regen.ecocredit.v1alpha2.BatchInfo} returns this
 */
proto.regen.ecocredit.v1alpha2.BatchInfo.prototype.setMetadata = function(value) {
  return jspb.Message.setProto3BytesField(this, 5, value);
};


/**
 * optional string amount_cancelled = 6;
 * @return {string}
 */
proto.regen.ecocredit.v1alpha2.BatchInfo.prototype.getAmountCancelled = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 6, ""));
};


/**
 * @param {string} value
 * @return {!proto.regen.ecocredit.v1alpha2.BatchInfo} returns this
 */
proto.regen.ecocredit.v1alpha2.BatchInfo.prototype.setAmountCancelled = function(value) {
  return jspb.Message.setProto3StringField(this, 6, value);
};


/**
 * optional google.protobuf.Timestamp start_date = 7;
 * @return {?proto.google.protobuf.Timestamp}
 */
proto.regen.ecocredit.v1alpha2.BatchInfo.prototype.getStartDate = function() {
  return /** @type{?proto.google.protobuf.Timestamp} */ (
    jspb.Message.getWrapperField(this, proto.google.protobuf.Timestamp, 7));
};


/**
 * @param {?proto.google.protobuf.Timestamp|undefined} value
 * @return {!proto.regen.ecocredit.v1alpha2.BatchInfo} returns this
*/
proto.regen.ecocredit.v1alpha2.BatchInfo.prototype.setStartDate = function(value) {
  return jspb.Message.setWrapperField(this, 7, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.regen.ecocredit.v1alpha2.BatchInfo} returns this
 */
proto.regen.ecocredit.v1alpha2.BatchInfo.prototype.clearStartDate = function() {
  return this.setStartDate(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.regen.ecocredit.v1alpha2.BatchInfo.prototype.hasStartDate = function() {
  return jspb.Message.getField(this, 7) != null;
};


/**
 * optional google.protobuf.Timestamp end_date = 8;
 * @return {?proto.google.protobuf.Timestamp}
 */
proto.regen.ecocredit.v1alpha2.BatchInfo.prototype.getEndDate = function() {
  return /** @type{?proto.google.protobuf.Timestamp} */ (
    jspb.Message.getWrapperField(this, proto.google.protobuf.Timestamp, 8));
};


/**
 * @param {?proto.google.protobuf.Timestamp|undefined} value
 * @return {!proto.regen.ecocredit.v1alpha2.BatchInfo} returns this
*/
proto.regen.ecocredit.v1alpha2.BatchInfo.prototype.setEndDate = function(value) {
  return jspb.Message.setWrapperField(this, 8, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.regen.ecocredit.v1alpha2.BatchInfo} returns this
 */
proto.regen.ecocredit.v1alpha2.BatchInfo.prototype.clearEndDate = function() {
  return this.setEndDate(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.regen.ecocredit.v1alpha2.BatchInfo.prototype.hasEndDate = function() {
  return jspb.Message.getField(this, 8) != null;
};

