// source: injective/peggy/v1/batch.proto
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

goog.provide('proto.injective.peggy.v1.OutgoingTxBatch');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.injective.peggy.v1.OutgoingTransferTx');

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
proto.injective.peggy.v1.OutgoingTxBatch = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.injective.peggy.v1.OutgoingTxBatch.repeatedFields_, null);
};
goog.inherits(proto.injective.peggy.v1.OutgoingTxBatch, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.injective.peggy.v1.OutgoingTxBatch.displayName = 'proto.injective.peggy.v1.OutgoingTxBatch';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.injective.peggy.v1.OutgoingTxBatch.repeatedFields_ = [3];



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
proto.injective.peggy.v1.OutgoingTxBatch.prototype.toObject = function(opt_includeInstance) {
  return proto.injective.peggy.v1.OutgoingTxBatch.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.injective.peggy.v1.OutgoingTxBatch} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.injective.peggy.v1.OutgoingTxBatch.toObject = function(includeInstance, msg) {
  var f, obj = {
    batchNonce: jspb.Message.getFieldWithDefault(msg, 1, 0),
    batchTimeout: jspb.Message.getFieldWithDefault(msg, 2, 0),
    transactionsList: jspb.Message.toObjectList(msg.getTransactionsList(),
    proto.injective.peggy.v1.OutgoingTransferTx.toObject, includeInstance),
    tokenContract: jspb.Message.getFieldWithDefault(msg, 4, ""),
    block: jspb.Message.getFieldWithDefault(msg, 5, 0)
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
 * @return {!proto.injective.peggy.v1.OutgoingTxBatch}
 */
proto.injective.peggy.v1.OutgoingTxBatch.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.injective.peggy.v1.OutgoingTxBatch;
  return proto.injective.peggy.v1.OutgoingTxBatch.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.injective.peggy.v1.OutgoingTxBatch} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.injective.peggy.v1.OutgoingTxBatch}
 */
proto.injective.peggy.v1.OutgoingTxBatch.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setBatchNonce(value);
      break;
    case 2:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setBatchTimeout(value);
      break;
    case 3:
      var value = new proto.injective.peggy.v1.OutgoingTransferTx;
      reader.readMessage(value,proto.injective.peggy.v1.OutgoingTransferTx.deserializeBinaryFromReader);
      msg.addTransactions(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.setTokenContract(value);
      break;
    case 5:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setBlock(value);
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
proto.injective.peggy.v1.OutgoingTxBatch.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.injective.peggy.v1.OutgoingTxBatch.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.injective.peggy.v1.OutgoingTxBatch} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.injective.peggy.v1.OutgoingTxBatch.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getBatchNonce();
  if (f !== 0) {
    writer.writeUint64(
      1,
      f
    );
  }
  f = message.getBatchTimeout();
  if (f !== 0) {
    writer.writeUint64(
      2,
      f
    );
  }
  f = message.getTransactionsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      3,
      f,
      proto.injective.peggy.v1.OutgoingTransferTx.serializeBinaryToWriter
    );
  }
  f = message.getTokenContract();
  if (f.length > 0) {
    writer.writeString(
      4,
      f
    );
  }
  f = message.getBlock();
  if (f !== 0) {
    writer.writeUint64(
      5,
      f
    );
  }
};


/**
 * optional uint64 batch_nonce = 1;
 * @return {number}
 */
proto.injective.peggy.v1.OutgoingTxBatch.prototype.getBatchNonce = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/**
 * @param {number} value
 * @return {!proto.injective.peggy.v1.OutgoingTxBatch} returns this
 */
proto.injective.peggy.v1.OutgoingTxBatch.prototype.setBatchNonce = function(value) {
  return jspb.Message.setProto3IntField(this, 1, value);
};


/**
 * optional uint64 batch_timeout = 2;
 * @return {number}
 */
proto.injective.peggy.v1.OutgoingTxBatch.prototype.getBatchTimeout = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 2, 0));
};


/**
 * @param {number} value
 * @return {!proto.injective.peggy.v1.OutgoingTxBatch} returns this
 */
proto.injective.peggy.v1.OutgoingTxBatch.prototype.setBatchTimeout = function(value) {
  return jspb.Message.setProto3IntField(this, 2, value);
};


/**
 * repeated OutgoingTransferTx transactions = 3;
 * @return {!Array<!proto.injective.peggy.v1.OutgoingTransferTx>}
 */
proto.injective.peggy.v1.OutgoingTxBatch.prototype.getTransactionsList = function() {
  return /** @type{!Array<!proto.injective.peggy.v1.OutgoingTransferTx>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.injective.peggy.v1.OutgoingTransferTx, 3));
};


/**
 * @param {!Array<!proto.injective.peggy.v1.OutgoingTransferTx>} value
 * @return {!proto.injective.peggy.v1.OutgoingTxBatch} returns this
*/
proto.injective.peggy.v1.OutgoingTxBatch.prototype.setTransactionsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 3, value);
};


/**
 * @param {!proto.injective.peggy.v1.OutgoingTransferTx=} opt_value
 * @param {number=} opt_index
 * @return {!proto.injective.peggy.v1.OutgoingTransferTx}
 */
proto.injective.peggy.v1.OutgoingTxBatch.prototype.addTransactions = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 3, opt_value, proto.injective.peggy.v1.OutgoingTransferTx, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.injective.peggy.v1.OutgoingTxBatch} returns this
 */
proto.injective.peggy.v1.OutgoingTxBatch.prototype.clearTransactionsList = function() {
  return this.setTransactionsList([]);
};


/**
 * optional string token_contract = 4;
 * @return {string}
 */
proto.injective.peggy.v1.OutgoingTxBatch.prototype.getTokenContract = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * @param {string} value
 * @return {!proto.injective.peggy.v1.OutgoingTxBatch} returns this
 */
proto.injective.peggy.v1.OutgoingTxBatch.prototype.setTokenContract = function(value) {
  return jspb.Message.setProto3StringField(this, 4, value);
};


/**
 * optional uint64 block = 5;
 * @return {number}
 */
proto.injective.peggy.v1.OutgoingTxBatch.prototype.getBlock = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 5, 0));
};


/**
 * @param {number} value
 * @return {!proto.injective.peggy.v1.OutgoingTxBatch} returns this
 */
proto.injective.peggy.v1.OutgoingTxBatch.prototype.setBlock = function(value) {
  return jspb.Message.setProto3IntField(this, 5, value);
};


