// source: axelar/nexus/v1beta1/tx.proto
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

goog.provide('proto.axelar.nexus.v1beta1.RegisterAssetFeeRequest');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.axelar.nexus.exported.v1beta1.FeeInfo');

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
proto.axelar.nexus.v1beta1.RegisterAssetFeeRequest = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.axelar.nexus.v1beta1.RegisterAssetFeeRequest, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.axelar.nexus.v1beta1.RegisterAssetFeeRequest.displayName = 'proto.axelar.nexus.v1beta1.RegisterAssetFeeRequest';
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
proto.axelar.nexus.v1beta1.RegisterAssetFeeRequest.prototype.toObject = function(opt_includeInstance) {
  return proto.axelar.nexus.v1beta1.RegisterAssetFeeRequest.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.axelar.nexus.v1beta1.RegisterAssetFeeRequest} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.axelar.nexus.v1beta1.RegisterAssetFeeRequest.toObject = function(includeInstance, msg) {
  var f, obj = {
    sender: msg.getSender_asB64(),
    feeInfo: (f = msg.getFeeInfo()) && proto.axelar.nexus.exported.v1beta1.FeeInfo.toObject(includeInstance, f)
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
 * @return {!proto.axelar.nexus.v1beta1.RegisterAssetFeeRequest}
 */
proto.axelar.nexus.v1beta1.RegisterAssetFeeRequest.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.axelar.nexus.v1beta1.RegisterAssetFeeRequest;
  return proto.axelar.nexus.v1beta1.RegisterAssetFeeRequest.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.axelar.nexus.v1beta1.RegisterAssetFeeRequest} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.axelar.nexus.v1beta1.RegisterAssetFeeRequest}
 */
proto.axelar.nexus.v1beta1.RegisterAssetFeeRequest.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setSender(value);
      break;
    case 2:
      var value = new proto.axelar.nexus.exported.v1beta1.FeeInfo;
      reader.readMessage(value,proto.axelar.nexus.exported.v1beta1.FeeInfo.deserializeBinaryFromReader);
      msg.setFeeInfo(value);
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
proto.axelar.nexus.v1beta1.RegisterAssetFeeRequest.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.axelar.nexus.v1beta1.RegisterAssetFeeRequest.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.axelar.nexus.v1beta1.RegisterAssetFeeRequest} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.axelar.nexus.v1beta1.RegisterAssetFeeRequest.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getSender_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      1,
      f
    );
  }
  f = message.getFeeInfo();
  if (f != null) {
    writer.writeMessage(
      2,
      f,
      proto.axelar.nexus.exported.v1beta1.FeeInfo.serializeBinaryToWriter
    );
  }
};


/**
 * optional bytes sender = 1;
 * @return {string}
 */
proto.axelar.nexus.v1beta1.RegisterAssetFeeRequest.prototype.getSender = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * optional bytes sender = 1;
 * This is a type-conversion wrapper around `getSender()`
 * @return {string}
 */
proto.axelar.nexus.v1beta1.RegisterAssetFeeRequest.prototype.getSender_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getSender()));
};


/**
 * optional bytes sender = 1;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getSender()`
 * @return {!Uint8Array}
 */
proto.axelar.nexus.v1beta1.RegisterAssetFeeRequest.prototype.getSender_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getSender()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.axelar.nexus.v1beta1.RegisterAssetFeeRequest} returns this
 */
proto.axelar.nexus.v1beta1.RegisterAssetFeeRequest.prototype.setSender = function(value) {
  return jspb.Message.setProto3BytesField(this, 1, value);
};


/**
 * optional axelar.nexus.exported.v1beta1.FeeInfo fee_info = 2;
 * @return {?proto.axelar.nexus.exported.v1beta1.FeeInfo}
 */
proto.axelar.nexus.v1beta1.RegisterAssetFeeRequest.prototype.getFeeInfo = function() {
  return /** @type{?proto.axelar.nexus.exported.v1beta1.FeeInfo} */ (
    jspb.Message.getWrapperField(this, proto.axelar.nexus.exported.v1beta1.FeeInfo, 2));
};


/**
 * @param {?proto.axelar.nexus.exported.v1beta1.FeeInfo|undefined} value
 * @return {!proto.axelar.nexus.v1beta1.RegisterAssetFeeRequest} returns this
*/
proto.axelar.nexus.v1beta1.RegisterAssetFeeRequest.prototype.setFeeInfo = function(value) {
  return jspb.Message.setWrapperField(this, 2, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.axelar.nexus.v1beta1.RegisterAssetFeeRequest} returns this
 */
proto.axelar.nexus.v1beta1.RegisterAssetFeeRequest.prototype.clearFeeInfo = function() {
  return this.setFeeInfo(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.axelar.nexus.v1beta1.RegisterAssetFeeRequest.prototype.hasFeeInfo = function() {
  return jspb.Message.getField(this, 2) != null;
};


