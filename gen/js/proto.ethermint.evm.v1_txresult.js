// source: ethermint/evm/v1/evm.proto
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

goog.provide('proto.ethermint.evm.v1.TxResult');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.ethermint.evm.v1.TransactionLogs');

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
proto.ethermint.evm.v1.TxResult = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.ethermint.evm.v1.TxResult, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.ethermint.evm.v1.TxResult.displayName = 'proto.ethermint.evm.v1.TxResult';
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
proto.ethermint.evm.v1.TxResult.prototype.toObject = function(opt_includeInstance) {
  return proto.ethermint.evm.v1.TxResult.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.ethermint.evm.v1.TxResult} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.ethermint.evm.v1.TxResult.toObject = function(includeInstance, msg) {
  var f, obj = {
    contractAddress: jspb.Message.getFieldWithDefault(msg, 1, ""),
    bloom: msg.getBloom_asB64(),
    txLogs: (f = msg.getTxLogs()) && proto.ethermint.evm.v1.TransactionLogs.toObject(includeInstance, f),
    ret: msg.getRet_asB64(),
    reverted: jspb.Message.getBooleanFieldWithDefault(msg, 5, false),
    gasUsed: jspb.Message.getFieldWithDefault(msg, 6, 0)
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
 * @return {!proto.ethermint.evm.v1.TxResult}
 */
proto.ethermint.evm.v1.TxResult.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.ethermint.evm.v1.TxResult;
  return proto.ethermint.evm.v1.TxResult.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.ethermint.evm.v1.TxResult} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.ethermint.evm.v1.TxResult}
 */
proto.ethermint.evm.v1.TxResult.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setContractAddress(value);
      break;
    case 2:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setBloom(value);
      break;
    case 3:
      var value = new proto.ethermint.evm.v1.TransactionLogs;
      reader.readMessage(value,proto.ethermint.evm.v1.TransactionLogs.deserializeBinaryFromReader);
      msg.setTxLogs(value);
      break;
    case 4:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setRet(value);
      break;
    case 5:
      var value = /** @type {boolean} */ (reader.readBool());
      msg.setReverted(value);
      break;
    case 6:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setGasUsed(value);
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
proto.ethermint.evm.v1.TxResult.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.ethermint.evm.v1.TxResult.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.ethermint.evm.v1.TxResult} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.ethermint.evm.v1.TxResult.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getContractAddress();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getBloom_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      2,
      f
    );
  }
  f = message.getTxLogs();
  if (f != null) {
    writer.writeMessage(
      3,
      f,
      proto.ethermint.evm.v1.TransactionLogs.serializeBinaryToWriter
    );
  }
  f = message.getRet_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      4,
      f
    );
  }
  f = message.getReverted();
  if (f) {
    writer.writeBool(
      5,
      f
    );
  }
  f = message.getGasUsed();
  if (f !== 0) {
    writer.writeUint64(
      6,
      f
    );
  }
};


/**
 * optional string contract_address = 1;
 * @return {string}
 */
proto.ethermint.evm.v1.TxResult.prototype.getContractAddress = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.ethermint.evm.v1.TxResult} returns this
 */
proto.ethermint.evm.v1.TxResult.prototype.setContractAddress = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional bytes bloom = 2;
 * @return {string}
 */
proto.ethermint.evm.v1.TxResult.prototype.getBloom = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * optional bytes bloom = 2;
 * This is a type-conversion wrapper around `getBloom()`
 * @return {string}
 */
proto.ethermint.evm.v1.TxResult.prototype.getBloom_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getBloom()));
};


/**
 * optional bytes bloom = 2;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getBloom()`
 * @return {!Uint8Array}
 */
proto.ethermint.evm.v1.TxResult.prototype.getBloom_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getBloom()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.ethermint.evm.v1.TxResult} returns this
 */
proto.ethermint.evm.v1.TxResult.prototype.setBloom = function(value) {
  return jspb.Message.setProto3BytesField(this, 2, value);
};


/**
 * optional TransactionLogs tx_logs = 3;
 * @return {?proto.ethermint.evm.v1.TransactionLogs}
 */
proto.ethermint.evm.v1.TxResult.prototype.getTxLogs = function() {
  return /** @type{?proto.ethermint.evm.v1.TransactionLogs} */ (
    jspb.Message.getWrapperField(this, proto.ethermint.evm.v1.TransactionLogs, 3));
};


/**
 * @param {?proto.ethermint.evm.v1.TransactionLogs|undefined} value
 * @return {!proto.ethermint.evm.v1.TxResult} returns this
*/
proto.ethermint.evm.v1.TxResult.prototype.setTxLogs = function(value) {
  return jspb.Message.setWrapperField(this, 3, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.ethermint.evm.v1.TxResult} returns this
 */
proto.ethermint.evm.v1.TxResult.prototype.clearTxLogs = function() {
  return this.setTxLogs(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.ethermint.evm.v1.TxResult.prototype.hasTxLogs = function() {
  return jspb.Message.getField(this, 3) != null;
};


/**
 * optional bytes ret = 4;
 * @return {string}
 */
proto.ethermint.evm.v1.TxResult.prototype.getRet = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * optional bytes ret = 4;
 * This is a type-conversion wrapper around `getRet()`
 * @return {string}
 */
proto.ethermint.evm.v1.TxResult.prototype.getRet_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getRet()));
};


/**
 * optional bytes ret = 4;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getRet()`
 * @return {!Uint8Array}
 */
proto.ethermint.evm.v1.TxResult.prototype.getRet_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getRet()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.ethermint.evm.v1.TxResult} returns this
 */
proto.ethermint.evm.v1.TxResult.prototype.setRet = function(value) {
  return jspb.Message.setProto3BytesField(this, 4, value);
};


/**
 * optional bool reverted = 5;
 * @return {boolean}
 */
proto.ethermint.evm.v1.TxResult.prototype.getReverted = function() {
  return /** @type {boolean} */ (jspb.Message.getBooleanFieldWithDefault(this, 5, false));
};


/**
 * @param {boolean} value
 * @return {!proto.ethermint.evm.v1.TxResult} returns this
 */
proto.ethermint.evm.v1.TxResult.prototype.setReverted = function(value) {
  return jspb.Message.setProto3BooleanField(this, 5, value);
};


/**
 * optional uint64 gas_used = 6;
 * @return {number}
 */
proto.ethermint.evm.v1.TxResult.prototype.getGasUsed = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 6, 0));
};


/**
 * @param {number} value
 * @return {!proto.ethermint.evm.v1.TxResult} returns this
 */
proto.ethermint.evm.v1.TxResult.prototype.setGasUsed = function(value) {
  return jspb.Message.setProto3IntField(this, 6, value);
};

