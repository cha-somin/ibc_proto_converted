// source: shentu/cvm/v1alpha1/tx.proto
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

goog.provide('proto.shentu.cvm.v1alpha1.MsgDeployResponse');

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
proto.shentu.cvm.v1alpha1.MsgDeployResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.shentu.cvm.v1alpha1.MsgDeployResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.shentu.cvm.v1alpha1.MsgDeployResponse.displayName = 'proto.shentu.cvm.v1alpha1.MsgDeployResponse';
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
proto.shentu.cvm.v1alpha1.MsgDeployResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.shentu.cvm.v1alpha1.MsgDeployResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.shentu.cvm.v1alpha1.MsgDeployResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.shentu.cvm.v1alpha1.MsgDeployResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    result: msg.getResult_asB64()
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
 * @return {!proto.shentu.cvm.v1alpha1.MsgDeployResponse}
 */
proto.shentu.cvm.v1alpha1.MsgDeployResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.shentu.cvm.v1alpha1.MsgDeployResponse;
  return proto.shentu.cvm.v1alpha1.MsgDeployResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.shentu.cvm.v1alpha1.MsgDeployResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.shentu.cvm.v1alpha1.MsgDeployResponse}
 */
proto.shentu.cvm.v1alpha1.MsgDeployResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setResult(value);
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
proto.shentu.cvm.v1alpha1.MsgDeployResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.shentu.cvm.v1alpha1.MsgDeployResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.shentu.cvm.v1alpha1.MsgDeployResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.shentu.cvm.v1alpha1.MsgDeployResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getResult_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      1,
      f
    );
  }
};


/**
 * optional bytes result = 1;
 * @return {string}
 */
proto.shentu.cvm.v1alpha1.MsgDeployResponse.prototype.getResult = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * optional bytes result = 1;
 * This is a type-conversion wrapper around `getResult()`
 * @return {string}
 */
proto.shentu.cvm.v1alpha1.MsgDeployResponse.prototype.getResult_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getResult()));
};


/**
 * optional bytes result = 1;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getResult()`
 * @return {!Uint8Array}
 */
proto.shentu.cvm.v1alpha1.MsgDeployResponse.prototype.getResult_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getResult()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.shentu.cvm.v1alpha1.MsgDeployResponse} returns this
 */
proto.shentu.cvm.v1alpha1.MsgDeployResponse.prototype.setResult = function(value) {
  return jspb.Message.setProto3BytesField(this, 1, value);
};


