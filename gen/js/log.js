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

goog.provide('proto.ethermint.evm.v1.Log');

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
proto.ethermint.evm.v1.Log = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.ethermint.evm.v1.Log.repeatedFields_, null);
};
goog.inherits(proto.ethermint.evm.v1.Log, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.ethermint.evm.v1.Log.displayName = 'proto.ethermint.evm.v1.Log';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.ethermint.evm.v1.Log.repeatedFields_ = [2];



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
proto.ethermint.evm.v1.Log.prototype.toObject = function(opt_includeInstance) {
  return proto.ethermint.evm.v1.Log.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.ethermint.evm.v1.Log} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.ethermint.evm.v1.Log.toObject = function(includeInstance, msg) {
  var f, obj = {
    address: jspb.Message.getFieldWithDefault(msg, 1, ""),
    topicsList: (f = jspb.Message.getRepeatedField(msg, 2)) == null ? undefined : f,
    data: msg.getData_asB64(),
    blockNumber: jspb.Message.getFieldWithDefault(msg, 4, 0),
    txHash: jspb.Message.getFieldWithDefault(msg, 5, ""),
    txIndex: jspb.Message.getFieldWithDefault(msg, 6, 0),
    blockHash: jspb.Message.getFieldWithDefault(msg, 7, ""),
    index: jspb.Message.getFieldWithDefault(msg, 8, 0),
    removed: jspb.Message.getBooleanFieldWithDefault(msg, 9, false)
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
 * @return {!proto.ethermint.evm.v1.Log}
 */
proto.ethermint.evm.v1.Log.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.ethermint.evm.v1.Log;
  return proto.ethermint.evm.v1.Log.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.ethermint.evm.v1.Log} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.ethermint.evm.v1.Log}
 */
proto.ethermint.evm.v1.Log.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setAddress(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.addTopics(value);
      break;
    case 3:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setData(value);
      break;
    case 4:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setBlockNumber(value);
      break;
    case 5:
      var value = /** @type {string} */ (reader.readString());
      msg.setTxHash(value);
      break;
    case 6:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setTxIndex(value);
      break;
    case 7:
      var value = /** @type {string} */ (reader.readString());
      msg.setBlockHash(value);
      break;
    case 8:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setIndex(value);
      break;
    case 9:
      var value = /** @type {boolean} */ (reader.readBool());
      msg.setRemoved(value);
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
proto.ethermint.evm.v1.Log.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.ethermint.evm.v1.Log.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.ethermint.evm.v1.Log} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.ethermint.evm.v1.Log.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getAddress();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getTopicsList();
  if (f.length > 0) {
    writer.writeRepeatedString(
      2,
      f
    );
  }
  f = message.getData_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      3,
      f
    );
  }
  f = message.getBlockNumber();
  if (f !== 0) {
    writer.writeUint64(
      4,
      f
    );
  }
  f = message.getTxHash();
  if (f.length > 0) {
    writer.writeString(
      5,
      f
    );
  }
  f = message.getTxIndex();
  if (f !== 0) {
    writer.writeUint64(
      6,
      f
    );
  }
  f = message.getBlockHash();
  if (f.length > 0) {
    writer.writeString(
      7,
      f
    );
  }
  f = message.getIndex();
  if (f !== 0) {
    writer.writeUint64(
      8,
      f
    );
  }
  f = message.getRemoved();
  if (f) {
    writer.writeBool(
      9,
      f
    );
  }
};


/**
 * optional string address = 1;
 * @return {string}
 */
proto.ethermint.evm.v1.Log.prototype.getAddress = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.ethermint.evm.v1.Log} returns this
 */
proto.ethermint.evm.v1.Log.prototype.setAddress = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * repeated string topics = 2;
 * @return {!Array<string>}
 */
proto.ethermint.evm.v1.Log.prototype.getTopicsList = function() {
  return /** @type {!Array<string>} */ (jspb.Message.getRepeatedField(this, 2));
};


/**
 * @param {!Array<string>} value
 * @return {!proto.ethermint.evm.v1.Log} returns this
 */
proto.ethermint.evm.v1.Log.prototype.setTopicsList = function(value) {
  return jspb.Message.setField(this, 2, value || []);
};


/**
 * @param {string} value
 * @param {number=} opt_index
 * @return {!proto.ethermint.evm.v1.Log} returns this
 */
proto.ethermint.evm.v1.Log.prototype.addTopics = function(value, opt_index) {
  return jspb.Message.addToRepeatedField(this, 2, value, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.ethermint.evm.v1.Log} returns this
 */
proto.ethermint.evm.v1.Log.prototype.clearTopicsList = function() {
  return this.setTopicsList([]);
};


/**
 * optional bytes data = 3;
 * @return {string}
 */
proto.ethermint.evm.v1.Log.prototype.getData = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * optional bytes data = 3;
 * This is a type-conversion wrapper around `getData()`
 * @return {string}
 */
proto.ethermint.evm.v1.Log.prototype.getData_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getData()));
};


/**
 * optional bytes data = 3;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getData()`
 * @return {!Uint8Array}
 */
proto.ethermint.evm.v1.Log.prototype.getData_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getData()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.ethermint.evm.v1.Log} returns this
 */
proto.ethermint.evm.v1.Log.prototype.setData = function(value) {
  return jspb.Message.setProto3BytesField(this, 3, value);
};


/**
 * optional uint64 block_number = 4;
 * @return {number}
 */
proto.ethermint.evm.v1.Log.prototype.getBlockNumber = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 4, 0));
};


/**
 * @param {number} value
 * @return {!proto.ethermint.evm.v1.Log} returns this
 */
proto.ethermint.evm.v1.Log.prototype.setBlockNumber = function(value) {
  return jspb.Message.setProto3IntField(this, 4, value);
};


/**
 * optional string tx_hash = 5;
 * @return {string}
 */
proto.ethermint.evm.v1.Log.prototype.getTxHash = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 5, ""));
};


/**
 * @param {string} value
 * @return {!proto.ethermint.evm.v1.Log} returns this
 */
proto.ethermint.evm.v1.Log.prototype.setTxHash = function(value) {
  return jspb.Message.setProto3StringField(this, 5, value);
};


/**
 * optional uint64 tx_index = 6;
 * @return {number}
 */
proto.ethermint.evm.v1.Log.prototype.getTxIndex = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 6, 0));
};


/**
 * @param {number} value
 * @return {!proto.ethermint.evm.v1.Log} returns this
 */
proto.ethermint.evm.v1.Log.prototype.setTxIndex = function(value) {
  return jspb.Message.setProto3IntField(this, 6, value);
};


/**
 * optional string block_hash = 7;
 * @return {string}
 */
proto.ethermint.evm.v1.Log.prototype.getBlockHash = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 7, ""));
};


/**
 * @param {string} value
 * @return {!proto.ethermint.evm.v1.Log} returns this
 */
proto.ethermint.evm.v1.Log.prototype.setBlockHash = function(value) {
  return jspb.Message.setProto3StringField(this, 7, value);
};


/**
 * optional uint64 index = 8;
 * @return {number}
 */
proto.ethermint.evm.v1.Log.prototype.getIndex = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 8, 0));
};


/**
 * @param {number} value
 * @return {!proto.ethermint.evm.v1.Log} returns this
 */
proto.ethermint.evm.v1.Log.prototype.setIndex = function(value) {
  return jspb.Message.setProto3IntField(this, 8, value);
};


/**
 * optional bool removed = 9;
 * @return {boolean}
 */
proto.ethermint.evm.v1.Log.prototype.getRemoved = function() {
  return /** @type {boolean} */ (jspb.Message.getBooleanFieldWithDefault(this, 9, false));
};


/**
 * @param {boolean} value
 * @return {!proto.ethermint.evm.v1.Log} returns this
 */
proto.ethermint.evm.v1.Log.prototype.setRemoved = function(value) {
  return jspb.Message.setProto3BooleanField(this, 9, value);
};


