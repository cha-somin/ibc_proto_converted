// source: axelar/evm/v1beta1/types.proto
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

goog.provide('proto.axelar.evm.v1beta1.SigMetadata');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');

goog.forwardDeclare('proto.axelar.evm.v1beta1.SigType');
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
proto.axelar.evm.v1beta1.SigMetadata = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.axelar.evm.v1beta1.SigMetadata, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.axelar.evm.v1beta1.SigMetadata.displayName = 'proto.axelar.evm.v1beta1.SigMetadata';
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
proto.axelar.evm.v1beta1.SigMetadata.prototype.toObject = function(opt_includeInstance) {
  return proto.axelar.evm.v1beta1.SigMetadata.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.axelar.evm.v1beta1.SigMetadata} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.axelar.evm.v1beta1.SigMetadata.toObject = function(includeInstance, msg) {
  var f, obj = {
    type: jspb.Message.getFieldWithDefault(msg, 1, 0),
    chain: jspb.Message.getFieldWithDefault(msg, 2, ""),
    commandBatchId: msg.getCommandBatchId_asB64()
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
 * @return {!proto.axelar.evm.v1beta1.SigMetadata}
 */
proto.axelar.evm.v1beta1.SigMetadata.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.axelar.evm.v1beta1.SigMetadata;
  return proto.axelar.evm.v1beta1.SigMetadata.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.axelar.evm.v1beta1.SigMetadata} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.axelar.evm.v1beta1.SigMetadata}
 */
proto.axelar.evm.v1beta1.SigMetadata.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {!proto.axelar.evm.v1beta1.SigType} */ (reader.readEnum());
      msg.setType(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setChain(value);
      break;
    case 3:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setCommandBatchId(value);
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
proto.axelar.evm.v1beta1.SigMetadata.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.axelar.evm.v1beta1.SigMetadata.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.axelar.evm.v1beta1.SigMetadata} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.axelar.evm.v1beta1.SigMetadata.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getType();
  if (f !== 0.0) {
    writer.writeEnum(
      1,
      f
    );
  }
  f = message.getChain();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getCommandBatchId_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      3,
      f
    );
  }
};


/**
 * optional SigType type = 1;
 * @return {!proto.axelar.evm.v1beta1.SigType}
 */
proto.axelar.evm.v1beta1.SigMetadata.prototype.getType = function() {
  return /** @type {!proto.axelar.evm.v1beta1.SigType} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/**
 * @param {!proto.axelar.evm.v1beta1.SigType} value
 * @return {!proto.axelar.evm.v1beta1.SigMetadata} returns this
 */
proto.axelar.evm.v1beta1.SigMetadata.prototype.setType = function(value) {
  return jspb.Message.setProto3EnumField(this, 1, value);
};


/**
 * optional string chain = 2;
 * @return {string}
 */
proto.axelar.evm.v1beta1.SigMetadata.prototype.getChain = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.axelar.evm.v1beta1.SigMetadata} returns this
 */
proto.axelar.evm.v1beta1.SigMetadata.prototype.setChain = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional bytes command_batch_id = 3;
 * @return {string}
 */
proto.axelar.evm.v1beta1.SigMetadata.prototype.getCommandBatchId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * optional bytes command_batch_id = 3;
 * This is a type-conversion wrapper around `getCommandBatchId()`
 * @return {string}
 */
proto.axelar.evm.v1beta1.SigMetadata.prototype.getCommandBatchId_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getCommandBatchId()));
};


/**
 * optional bytes command_batch_id = 3;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getCommandBatchId()`
 * @return {!Uint8Array}
 */
proto.axelar.evm.v1beta1.SigMetadata.prototype.getCommandBatchId_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getCommandBatchId()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.axelar.evm.v1beta1.SigMetadata} returns this
 */
proto.axelar.evm.v1beta1.SigMetadata.prototype.setCommandBatchId = function(value) {
  return jspb.Message.setProto3BytesField(this, 3, value);
};


