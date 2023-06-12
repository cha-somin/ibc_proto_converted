// source: cosmos/base/abci/v1beta1/abci.proto
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

goog.provide('proto.cosmos.base.abci.v1beta1.TxResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.cosmos.base.abci.v1beta1.ABCIMessageLog');
goog.require('proto.google.protobuf.Any');
goog.require('proto.tendermint.abci.Event');

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
proto.cosmos.base.abci.v1beta1.TxResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.cosmos.base.abci.v1beta1.TxResponse.repeatedFields_, null);
};
goog.inherits(proto.cosmos.base.abci.v1beta1.TxResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.cosmos.base.abci.v1beta1.TxResponse.displayName = 'proto.cosmos.base.abci.v1beta1.TxResponse';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.cosmos.base.abci.v1beta1.TxResponse.repeatedFields_ = [7,13];



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
proto.cosmos.base.abci.v1beta1.TxResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.cosmos.base.abci.v1beta1.TxResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.cosmos.base.abci.v1beta1.TxResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cosmos.base.abci.v1beta1.TxResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    height: jspb.Message.getFieldWithDefault(msg, 1, 0),
    txhash: jspb.Message.getFieldWithDefault(msg, 2, ""),
    codespace: jspb.Message.getFieldWithDefault(msg, 3, ""),
    code: jspb.Message.getFieldWithDefault(msg, 4, 0),
    data: jspb.Message.getFieldWithDefault(msg, 5, ""),
    rawLog: jspb.Message.getFieldWithDefault(msg, 6, ""),
    logsList: jspb.Message.toObjectList(msg.getLogsList(),
    proto.cosmos.base.abci.v1beta1.ABCIMessageLog.toObject, includeInstance),
    info: jspb.Message.getFieldWithDefault(msg, 8, ""),
    gasWanted: jspb.Message.getFieldWithDefault(msg, 9, 0),
    gasUsed: jspb.Message.getFieldWithDefault(msg, 10, 0),
    tx: (f = msg.getTx()) && proto.google.protobuf.Any.toObject(includeInstance, f),
    timestamp: jspb.Message.getFieldWithDefault(msg, 12, ""),
    eventsList: jspb.Message.toObjectList(msg.getEventsList(),
    proto.tendermint.abci.Event.toObject, includeInstance)
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
 * @return {!proto.cosmos.base.abci.v1beta1.TxResponse}
 */
proto.cosmos.base.abci.v1beta1.TxResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.cosmos.base.abci.v1beta1.TxResponse;
  return proto.cosmos.base.abci.v1beta1.TxResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.cosmos.base.abci.v1beta1.TxResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.cosmos.base.abci.v1beta1.TxResponse}
 */
proto.cosmos.base.abci.v1beta1.TxResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {number} */ (reader.readInt64());
      msg.setHeight(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setTxhash(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setCodespace(value);
      break;
    case 4:
      var value = /** @type {number} */ (reader.readUint32());
      msg.setCode(value);
      break;
    case 5:
      var value = /** @type {string} */ (reader.readString());
      msg.setData(value);
      break;
    case 6:
      var value = /** @type {string} */ (reader.readString());
      msg.setRawLog(value);
      break;
    case 7:
      var value = new proto.cosmos.base.abci.v1beta1.ABCIMessageLog;
      reader.readMessage(value,proto.cosmos.base.abci.v1beta1.ABCIMessageLog.deserializeBinaryFromReader);
      msg.addLogs(value);
      break;
    case 8:
      var value = /** @type {string} */ (reader.readString());
      msg.setInfo(value);
      break;
    case 9:
      var value = /** @type {number} */ (reader.readInt64());
      msg.setGasWanted(value);
      break;
    case 10:
      var value = /** @type {number} */ (reader.readInt64());
      msg.setGasUsed(value);
      break;
    case 11:
      var value = new proto.google.protobuf.Any;
      reader.readMessage(value,proto.google.protobuf.Any.deserializeBinaryFromReader);
      msg.setTx(value);
      break;
    case 12:
      var value = /** @type {string} */ (reader.readString());
      msg.setTimestamp(value);
      break;
    case 13:
      var value = new proto.tendermint.abci.Event;
      reader.readMessage(value,proto.tendermint.abci.Event.deserializeBinaryFromReader);
      msg.addEvents(value);
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
proto.cosmos.base.abci.v1beta1.TxResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.cosmos.base.abci.v1beta1.TxResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.cosmos.base.abci.v1beta1.TxResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cosmos.base.abci.v1beta1.TxResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getHeight();
  if (f !== 0) {
    writer.writeInt64(
      1,
      f
    );
  }
  f = message.getTxhash();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getCodespace();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getCode();
  if (f !== 0) {
    writer.writeUint32(
      4,
      f
    );
  }
  f = message.getData();
  if (f.length > 0) {
    writer.writeString(
      5,
      f
    );
  }
  f = message.getRawLog();
  if (f.length > 0) {
    writer.writeString(
      6,
      f
    );
  }
  f = message.getLogsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      7,
      f,
      proto.cosmos.base.abci.v1beta1.ABCIMessageLog.serializeBinaryToWriter
    );
  }
  f = message.getInfo();
  if (f.length > 0) {
    writer.writeString(
      8,
      f
    );
  }
  f = message.getGasWanted();
  if (f !== 0) {
    writer.writeInt64(
      9,
      f
    );
  }
  f = message.getGasUsed();
  if (f !== 0) {
    writer.writeInt64(
      10,
      f
    );
  }
  f = message.getTx();
  if (f != null) {
    writer.writeMessage(
      11,
      f,
      proto.google.protobuf.Any.serializeBinaryToWriter
    );
  }
  f = message.getTimestamp();
  if (f.length > 0) {
    writer.writeString(
      12,
      f
    );
  }
  f = message.getEventsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      13,
      f,
      proto.tendermint.abci.Event.serializeBinaryToWriter
    );
  }
};


/**
 * optional int64 height = 1;
 * @return {number}
 */
proto.cosmos.base.abci.v1beta1.TxResponse.prototype.getHeight = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/**
 * @param {number} value
 * @return {!proto.cosmos.base.abci.v1beta1.TxResponse} returns this
 */
proto.cosmos.base.abci.v1beta1.TxResponse.prototype.setHeight = function(value) {
  return jspb.Message.setProto3IntField(this, 1, value);
};


/**
 * optional string txhash = 2;
 * @return {string}
 */
proto.cosmos.base.abci.v1beta1.TxResponse.prototype.getTxhash = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.cosmos.base.abci.v1beta1.TxResponse} returns this
 */
proto.cosmos.base.abci.v1beta1.TxResponse.prototype.setTxhash = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional string codespace = 3;
 * @return {string}
 */
proto.cosmos.base.abci.v1beta1.TxResponse.prototype.getCodespace = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.cosmos.base.abci.v1beta1.TxResponse} returns this
 */
proto.cosmos.base.abci.v1beta1.TxResponse.prototype.setCodespace = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * optional uint32 code = 4;
 * @return {number}
 */
proto.cosmos.base.abci.v1beta1.TxResponse.prototype.getCode = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 4, 0));
};


/**
 * @param {number} value
 * @return {!proto.cosmos.base.abci.v1beta1.TxResponse} returns this
 */
proto.cosmos.base.abci.v1beta1.TxResponse.prototype.setCode = function(value) {
  return jspb.Message.setProto3IntField(this, 4, value);
};


/**
 * optional string data = 5;
 * @return {string}
 */
proto.cosmos.base.abci.v1beta1.TxResponse.prototype.getData = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 5, ""));
};


/**
 * @param {string} value
 * @return {!proto.cosmos.base.abci.v1beta1.TxResponse} returns this
 */
proto.cosmos.base.abci.v1beta1.TxResponse.prototype.setData = function(value) {
  return jspb.Message.setProto3StringField(this, 5, value);
};


/**
 * optional string raw_log = 6;
 * @return {string}
 */
proto.cosmos.base.abci.v1beta1.TxResponse.prototype.getRawLog = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 6, ""));
};


/**
 * @param {string} value
 * @return {!proto.cosmos.base.abci.v1beta1.TxResponse} returns this
 */
proto.cosmos.base.abci.v1beta1.TxResponse.prototype.setRawLog = function(value) {
  return jspb.Message.setProto3StringField(this, 6, value);
};


/**
 * repeated ABCIMessageLog logs = 7;
 * @return {!Array<!proto.cosmos.base.abci.v1beta1.ABCIMessageLog>}
 */
proto.cosmos.base.abci.v1beta1.TxResponse.prototype.getLogsList = function() {
  return /** @type{!Array<!proto.cosmos.base.abci.v1beta1.ABCIMessageLog>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.cosmos.base.abci.v1beta1.ABCIMessageLog, 7));
};


/**
 * @param {!Array<!proto.cosmos.base.abci.v1beta1.ABCIMessageLog>} value
 * @return {!proto.cosmos.base.abci.v1beta1.TxResponse} returns this
*/
proto.cosmos.base.abci.v1beta1.TxResponse.prototype.setLogsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 7, value);
};


/**
 * @param {!proto.cosmos.base.abci.v1beta1.ABCIMessageLog=} opt_value
 * @param {number=} opt_index
 * @return {!proto.cosmos.base.abci.v1beta1.ABCIMessageLog}
 */
proto.cosmos.base.abci.v1beta1.TxResponse.prototype.addLogs = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 7, opt_value, proto.cosmos.base.abci.v1beta1.ABCIMessageLog, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.cosmos.base.abci.v1beta1.TxResponse} returns this
 */
proto.cosmos.base.abci.v1beta1.TxResponse.prototype.clearLogsList = function() {
  return this.setLogsList([]);
};


/**
 * optional string info = 8;
 * @return {string}
 */
proto.cosmos.base.abci.v1beta1.TxResponse.prototype.getInfo = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 8, ""));
};


/**
 * @param {string} value
 * @return {!proto.cosmos.base.abci.v1beta1.TxResponse} returns this
 */
proto.cosmos.base.abci.v1beta1.TxResponse.prototype.setInfo = function(value) {
  return jspb.Message.setProto3StringField(this, 8, value);
};


/**
 * optional int64 gas_wanted = 9;
 * @return {number}
 */
proto.cosmos.base.abci.v1beta1.TxResponse.prototype.getGasWanted = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 9, 0));
};


/**
 * @param {number} value
 * @return {!proto.cosmos.base.abci.v1beta1.TxResponse} returns this
 */
proto.cosmos.base.abci.v1beta1.TxResponse.prototype.setGasWanted = function(value) {
  return jspb.Message.setProto3IntField(this, 9, value);
};


/**
 * optional int64 gas_used = 10;
 * @return {number}
 */
proto.cosmos.base.abci.v1beta1.TxResponse.prototype.getGasUsed = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 10, 0));
};


/**
 * @param {number} value
 * @return {!proto.cosmos.base.abci.v1beta1.TxResponse} returns this
 */
proto.cosmos.base.abci.v1beta1.TxResponse.prototype.setGasUsed = function(value) {
  return jspb.Message.setProto3IntField(this, 10, value);
};


/**
 * optional google.protobuf.Any tx = 11;
 * @return {?proto.google.protobuf.Any}
 */
proto.cosmos.base.abci.v1beta1.TxResponse.prototype.getTx = function() {
  return /** @type{?proto.google.protobuf.Any} */ (
    jspb.Message.getWrapperField(this, proto.google.protobuf.Any, 11));
};


/**
 * @param {?proto.google.protobuf.Any|undefined} value
 * @return {!proto.cosmos.base.abci.v1beta1.TxResponse} returns this
*/
proto.cosmos.base.abci.v1beta1.TxResponse.prototype.setTx = function(value) {
  return jspb.Message.setWrapperField(this, 11, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.cosmos.base.abci.v1beta1.TxResponse} returns this
 */
proto.cosmos.base.abci.v1beta1.TxResponse.prototype.clearTx = function() {
  return this.setTx(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.cosmos.base.abci.v1beta1.TxResponse.prototype.hasTx = function() {
  return jspb.Message.getField(this, 11) != null;
};


/**
 * optional string timestamp = 12;
 * @return {string}
 */
proto.cosmos.base.abci.v1beta1.TxResponse.prototype.getTimestamp = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 12, ""));
};


/**
 * @param {string} value
 * @return {!proto.cosmos.base.abci.v1beta1.TxResponse} returns this
 */
proto.cosmos.base.abci.v1beta1.TxResponse.prototype.setTimestamp = function(value) {
  return jspb.Message.setProto3StringField(this, 12, value);
};


/**
 * repeated tendermint.abci.Event events = 13;
 * @return {!Array<!proto.tendermint.abci.Event>}
 */
proto.cosmos.base.abci.v1beta1.TxResponse.prototype.getEventsList = function() {
  return /** @type{!Array<!proto.tendermint.abci.Event>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.tendermint.abci.Event, 13));
};


/**
 * @param {!Array<!proto.tendermint.abci.Event>} value
 * @return {!proto.cosmos.base.abci.v1beta1.TxResponse} returns this
*/
proto.cosmos.base.abci.v1beta1.TxResponse.prototype.setEventsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 13, value);
};


/**
 * @param {!proto.tendermint.abci.Event=} opt_value
 * @param {number=} opt_index
 * @return {!proto.tendermint.abci.Event}
 */
proto.cosmos.base.abci.v1beta1.TxResponse.prototype.addEvents = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 13, opt_value, proto.tendermint.abci.Event, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.cosmos.base.abci.v1beta1.TxResponse} returns this
 */
proto.cosmos.base.abci.v1beta1.TxResponse.prototype.clearEventsList = function() {
  return this.setEventsList([]);
};


