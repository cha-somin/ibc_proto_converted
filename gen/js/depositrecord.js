// source: stride/records/genesis.proto
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

goog.provide('proto.stride.records.DepositRecord');
goog.provide('proto.stride.records.DepositRecord.Source');
goog.provide('proto.stride.records.DepositRecord.Status');

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
proto.stride.records.DepositRecord = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.stride.records.DepositRecord, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.stride.records.DepositRecord.displayName = 'proto.stride.records.DepositRecord';
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
proto.stride.records.DepositRecord.prototype.toObject = function(opt_includeInstance) {
  return proto.stride.records.DepositRecord.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.stride.records.DepositRecord} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.stride.records.DepositRecord.toObject = function(includeInstance, msg) {
  var f, obj = {
    id: jspb.Message.getFieldWithDefault(msg, 1, 0),
    amount: jspb.Message.getFieldWithDefault(msg, 2, ""),
    denom: jspb.Message.getFieldWithDefault(msg, 3, ""),
    hostZoneId: jspb.Message.getFieldWithDefault(msg, 4, ""),
    status: jspb.Message.getFieldWithDefault(msg, 6, 0),
    depositEpochNumber: jspb.Message.getFieldWithDefault(msg, 7, 0),
    source: jspb.Message.getFieldWithDefault(msg, 8, 0)
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
 * @return {!proto.stride.records.DepositRecord}
 */
proto.stride.records.DepositRecord.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.stride.records.DepositRecord;
  return proto.stride.records.DepositRecord.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.stride.records.DepositRecord} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.stride.records.DepositRecord}
 */
proto.stride.records.DepositRecord.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setId(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setAmount(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setDenom(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.setHostZoneId(value);
      break;
    case 6:
      var value = /** @type {!proto.stride.records.DepositRecord.Status} */ (reader.readEnum());
      msg.setStatus(value);
      break;
    case 7:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setDepositEpochNumber(value);
      break;
    case 8:
      var value = /** @type {!proto.stride.records.DepositRecord.Source} */ (reader.readEnum());
      msg.setSource(value);
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
proto.stride.records.DepositRecord.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.stride.records.DepositRecord.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.stride.records.DepositRecord} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.stride.records.DepositRecord.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getId();
  if (f !== 0) {
    writer.writeUint64(
      1,
      f
    );
  }
  f = message.getAmount();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getDenom();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getHostZoneId();
  if (f.length > 0) {
    writer.writeString(
      4,
      f
    );
  }
  f = message.getStatus();
  if (f !== 0.0) {
    writer.writeEnum(
      6,
      f
    );
  }
  f = message.getDepositEpochNumber();
  if (f !== 0) {
    writer.writeUint64(
      7,
      f
    );
  }
  f = message.getSource();
  if (f !== 0.0) {
    writer.writeEnum(
      8,
      f
    );
  }
};


/**
 * @enum {number}
 */
proto.stride.records.DepositRecord.Status = {
  TRANSFER_QUEUE: 0,
  TRANSFER_IN_PROGRESS: 2,
  DELEGATION_QUEUE: 1,
  DELEGATION_IN_PROGRESS: 3
};

/**
 * @enum {number}
 */
proto.stride.records.DepositRecord.Source = {
  STRIDE: 0,
  WITHDRAWAL_ICA: 1
};

/**
 * optional uint64 id = 1;
 * @return {number}
 */
proto.stride.records.DepositRecord.prototype.getId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/**
 * @param {number} value
 * @return {!proto.stride.records.DepositRecord} returns this
 */
proto.stride.records.DepositRecord.prototype.setId = function(value) {
  return jspb.Message.setProto3IntField(this, 1, value);
};


/**
 * optional string amount = 2;
 * @return {string}
 */
proto.stride.records.DepositRecord.prototype.getAmount = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.stride.records.DepositRecord} returns this
 */
proto.stride.records.DepositRecord.prototype.setAmount = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional string denom = 3;
 * @return {string}
 */
proto.stride.records.DepositRecord.prototype.getDenom = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.stride.records.DepositRecord} returns this
 */
proto.stride.records.DepositRecord.prototype.setDenom = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * optional string host_zone_id = 4;
 * @return {string}
 */
proto.stride.records.DepositRecord.prototype.getHostZoneId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * @param {string} value
 * @return {!proto.stride.records.DepositRecord} returns this
 */
proto.stride.records.DepositRecord.prototype.setHostZoneId = function(value) {
  return jspb.Message.setProto3StringField(this, 4, value);
};


/**
 * optional Status status = 6;
 * @return {!proto.stride.records.DepositRecord.Status}
 */
proto.stride.records.DepositRecord.prototype.getStatus = function() {
  return /** @type {!proto.stride.records.DepositRecord.Status} */ (jspb.Message.getFieldWithDefault(this, 6, 0));
};


/**
 * @param {!proto.stride.records.DepositRecord.Status} value
 * @return {!proto.stride.records.DepositRecord} returns this
 */
proto.stride.records.DepositRecord.prototype.setStatus = function(value) {
  return jspb.Message.setProto3EnumField(this, 6, value);
};


/**
 * optional uint64 deposit_epoch_number = 7;
 * @return {number}
 */
proto.stride.records.DepositRecord.prototype.getDepositEpochNumber = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 7, 0));
};


/**
 * @param {number} value
 * @return {!proto.stride.records.DepositRecord} returns this
 */
proto.stride.records.DepositRecord.prototype.setDepositEpochNumber = function(value) {
  return jspb.Message.setProto3IntField(this, 7, value);
};


/**
 * optional Source source = 8;
 * @return {!proto.stride.records.DepositRecord.Source}
 */
proto.stride.records.DepositRecord.prototype.getSource = function() {
  return /** @type {!proto.stride.records.DepositRecord.Source} */ (jspb.Message.getFieldWithDefault(this, 8, 0));
};


/**
 * @param {!proto.stride.records.DepositRecord.Source} value
 * @return {!proto.stride.records.DepositRecord} returns this
 */
proto.stride.records.DepositRecord.prototype.setSource = function(value) {
  return jspb.Message.setProto3EnumField(this, 8, value);
};

