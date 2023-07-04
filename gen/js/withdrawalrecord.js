// source: quicksilver/interchainstaking/v1/interchainstaking.proto
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

goog.provide('proto.quicksilver.interchainstaking.v1.WithdrawalRecord');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.cosmos.base.v1beta1.Coin');
goog.require('proto.google.protobuf.Timestamp');
goog.require('proto.quicksilver.interchainstaking.v1.Distribution');

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
proto.quicksilver.interchainstaking.v1.WithdrawalRecord = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.quicksilver.interchainstaking.v1.WithdrawalRecord.repeatedFields_, null);
};
goog.inherits(proto.quicksilver.interchainstaking.v1.WithdrawalRecord, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.quicksilver.interchainstaking.v1.WithdrawalRecord.displayName = 'proto.quicksilver.interchainstaking.v1.WithdrawalRecord';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.quicksilver.interchainstaking.v1.WithdrawalRecord.repeatedFields_ = [3,5];



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
proto.quicksilver.interchainstaking.v1.WithdrawalRecord.prototype.toObject = function(opt_includeInstance) {
  return proto.quicksilver.interchainstaking.v1.WithdrawalRecord.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.quicksilver.interchainstaking.v1.WithdrawalRecord} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.quicksilver.interchainstaking.v1.WithdrawalRecord.toObject = function(includeInstance, msg) {
  var f, obj = {
    chainId: jspb.Message.getFieldWithDefault(msg, 1, ""),
    delegator: jspb.Message.getFieldWithDefault(msg, 2, ""),
    distributionList: jspb.Message.toObjectList(msg.getDistributionList(),
    proto.quicksilver.interchainstaking.v1.Distribution.toObject, includeInstance),
    recipient: jspb.Message.getFieldWithDefault(msg, 4, ""),
    amountList: jspb.Message.toObjectList(msg.getAmountList(),
    proto.cosmos.base.v1beta1.Coin.toObject, includeInstance),
    burnAmount: (f = msg.getBurnAmount()) && proto.cosmos.base.v1beta1.Coin.toObject(includeInstance, f),
    txhash: jspb.Message.getFieldWithDefault(msg, 7, ""),
    status: jspb.Message.getFieldWithDefault(msg, 8, 0),
    completionTime: (f = msg.getCompletionTime()) && proto.google.protobuf.Timestamp.toObject(includeInstance, f),
    requeued: jspb.Message.getBooleanFieldWithDefault(msg, 10, false)
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
 * @return {!proto.quicksilver.interchainstaking.v1.WithdrawalRecord}
 */
proto.quicksilver.interchainstaking.v1.WithdrawalRecord.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.quicksilver.interchainstaking.v1.WithdrawalRecord;
  return proto.quicksilver.interchainstaking.v1.WithdrawalRecord.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.quicksilver.interchainstaking.v1.WithdrawalRecord} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.quicksilver.interchainstaking.v1.WithdrawalRecord}
 */
proto.quicksilver.interchainstaking.v1.WithdrawalRecord.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setChainId(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setDelegator(value);
      break;
    case 3:
      var value = new proto.quicksilver.interchainstaking.v1.Distribution;
      reader.readMessage(value,proto.quicksilver.interchainstaking.v1.Distribution.deserializeBinaryFromReader);
      msg.addDistribution(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.setRecipient(value);
      break;
    case 5:
      var value = new proto.cosmos.base.v1beta1.Coin;
      reader.readMessage(value,proto.cosmos.base.v1beta1.Coin.deserializeBinaryFromReader);
      msg.addAmount(value);
      break;
    case 6:
      var value = new proto.cosmos.base.v1beta1.Coin;
      reader.readMessage(value,proto.cosmos.base.v1beta1.Coin.deserializeBinaryFromReader);
      msg.setBurnAmount(value);
      break;
    case 7:
      var value = /** @type {string} */ (reader.readString());
      msg.setTxhash(value);
      break;
    case 8:
      var value = /** @type {number} */ (reader.readInt32());
      msg.setStatus(value);
      break;
    case 9:
      var value = new proto.google.protobuf.Timestamp;
      reader.readMessage(value,proto.google.protobuf.Timestamp.deserializeBinaryFromReader);
      msg.setCompletionTime(value);
      break;
    case 10:
      var value = /** @type {boolean} */ (reader.readBool());
      msg.setRequeued(value);
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
proto.quicksilver.interchainstaking.v1.WithdrawalRecord.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.quicksilver.interchainstaking.v1.WithdrawalRecord.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.quicksilver.interchainstaking.v1.WithdrawalRecord} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.quicksilver.interchainstaking.v1.WithdrawalRecord.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getChainId();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getDelegator();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getDistributionList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      3,
      f,
      proto.quicksilver.interchainstaking.v1.Distribution.serializeBinaryToWriter
    );
  }
  f = message.getRecipient();
  if (f.length > 0) {
    writer.writeString(
      4,
      f
    );
  }
  f = message.getAmountList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      5,
      f,
      proto.cosmos.base.v1beta1.Coin.serializeBinaryToWriter
    );
  }
  f = message.getBurnAmount();
  if (f != null) {
    writer.writeMessage(
      6,
      f,
      proto.cosmos.base.v1beta1.Coin.serializeBinaryToWriter
    );
  }
  f = message.getTxhash();
  if (f.length > 0) {
    writer.writeString(
      7,
      f
    );
  }
  f = message.getStatus();
  if (f !== 0) {
    writer.writeInt32(
      8,
      f
    );
  }
  f = message.getCompletionTime();
  if (f != null) {
    writer.writeMessage(
      9,
      f,
      proto.google.protobuf.Timestamp.serializeBinaryToWriter
    );
  }
  f = message.getRequeued();
  if (f) {
    writer.writeBool(
      10,
      f
    );
  }
};


/**
 * optional string chain_id = 1;
 * @return {string}
 */
proto.quicksilver.interchainstaking.v1.WithdrawalRecord.prototype.getChainId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.quicksilver.interchainstaking.v1.WithdrawalRecord} returns this
 */
proto.quicksilver.interchainstaking.v1.WithdrawalRecord.prototype.setChainId = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string delegator = 2;
 * @return {string}
 */
proto.quicksilver.interchainstaking.v1.WithdrawalRecord.prototype.getDelegator = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.quicksilver.interchainstaking.v1.WithdrawalRecord} returns this
 */
proto.quicksilver.interchainstaking.v1.WithdrawalRecord.prototype.setDelegator = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * repeated Distribution distribution = 3;
 * @return {!Array<!proto.quicksilver.interchainstaking.v1.Distribution>}
 */
proto.quicksilver.interchainstaking.v1.WithdrawalRecord.prototype.getDistributionList = function() {
  return /** @type{!Array<!proto.quicksilver.interchainstaking.v1.Distribution>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.quicksilver.interchainstaking.v1.Distribution, 3));
};


/**
 * @param {!Array<!proto.quicksilver.interchainstaking.v1.Distribution>} value
 * @return {!proto.quicksilver.interchainstaking.v1.WithdrawalRecord} returns this
*/
proto.quicksilver.interchainstaking.v1.WithdrawalRecord.prototype.setDistributionList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 3, value);
};


/**
 * @param {!proto.quicksilver.interchainstaking.v1.Distribution=} opt_value
 * @param {number=} opt_index
 * @return {!proto.quicksilver.interchainstaking.v1.Distribution}
 */
proto.quicksilver.interchainstaking.v1.WithdrawalRecord.prototype.addDistribution = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 3, opt_value, proto.quicksilver.interchainstaking.v1.Distribution, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.quicksilver.interchainstaking.v1.WithdrawalRecord} returns this
 */
proto.quicksilver.interchainstaking.v1.WithdrawalRecord.prototype.clearDistributionList = function() {
  return this.setDistributionList([]);
};


/**
 * optional string recipient = 4;
 * @return {string}
 */
proto.quicksilver.interchainstaking.v1.WithdrawalRecord.prototype.getRecipient = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * @param {string} value
 * @return {!proto.quicksilver.interchainstaking.v1.WithdrawalRecord} returns this
 */
proto.quicksilver.interchainstaking.v1.WithdrawalRecord.prototype.setRecipient = function(value) {
  return jspb.Message.setProto3StringField(this, 4, value);
};


/**
 * repeated cosmos.base.v1beta1.Coin amount = 5;
 * @return {!Array<!proto.cosmos.base.v1beta1.Coin>}
 */
proto.quicksilver.interchainstaking.v1.WithdrawalRecord.prototype.getAmountList = function() {
  return /** @type{!Array<!proto.cosmos.base.v1beta1.Coin>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.cosmos.base.v1beta1.Coin, 5));
};


/**
 * @param {!Array<!proto.cosmos.base.v1beta1.Coin>} value
 * @return {!proto.quicksilver.interchainstaking.v1.WithdrawalRecord} returns this
*/
proto.quicksilver.interchainstaking.v1.WithdrawalRecord.prototype.setAmountList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 5, value);
};


/**
 * @param {!proto.cosmos.base.v1beta1.Coin=} opt_value
 * @param {number=} opt_index
 * @return {!proto.cosmos.base.v1beta1.Coin}
 */
proto.quicksilver.interchainstaking.v1.WithdrawalRecord.prototype.addAmount = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 5, opt_value, proto.cosmos.base.v1beta1.Coin, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.quicksilver.interchainstaking.v1.WithdrawalRecord} returns this
 */
proto.quicksilver.interchainstaking.v1.WithdrawalRecord.prototype.clearAmountList = function() {
  return this.setAmountList([]);
};


/**
 * optional cosmos.base.v1beta1.Coin burn_amount = 6;
 * @return {?proto.cosmos.base.v1beta1.Coin}
 */
proto.quicksilver.interchainstaking.v1.WithdrawalRecord.prototype.getBurnAmount = function() {
  return /** @type{?proto.cosmos.base.v1beta1.Coin} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.base.v1beta1.Coin, 6));
};


/**
 * @param {?proto.cosmos.base.v1beta1.Coin|undefined} value
 * @return {!proto.quicksilver.interchainstaking.v1.WithdrawalRecord} returns this
*/
proto.quicksilver.interchainstaking.v1.WithdrawalRecord.prototype.setBurnAmount = function(value) {
  return jspb.Message.setWrapperField(this, 6, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.quicksilver.interchainstaking.v1.WithdrawalRecord} returns this
 */
proto.quicksilver.interchainstaking.v1.WithdrawalRecord.prototype.clearBurnAmount = function() {
  return this.setBurnAmount(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.quicksilver.interchainstaking.v1.WithdrawalRecord.prototype.hasBurnAmount = function() {
  return jspb.Message.getField(this, 6) != null;
};


/**
 * optional string txhash = 7;
 * @return {string}
 */
proto.quicksilver.interchainstaking.v1.WithdrawalRecord.prototype.getTxhash = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 7, ""));
};


/**
 * @param {string} value
 * @return {!proto.quicksilver.interchainstaking.v1.WithdrawalRecord} returns this
 */
proto.quicksilver.interchainstaking.v1.WithdrawalRecord.prototype.setTxhash = function(value) {
  return jspb.Message.setProto3StringField(this, 7, value);
};


/**
 * optional int32 status = 8;
 * @return {number}
 */
proto.quicksilver.interchainstaking.v1.WithdrawalRecord.prototype.getStatus = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 8, 0));
};


/**
 * @param {number} value
 * @return {!proto.quicksilver.interchainstaking.v1.WithdrawalRecord} returns this
 */
proto.quicksilver.interchainstaking.v1.WithdrawalRecord.prototype.setStatus = function(value) {
  return jspb.Message.setProto3IntField(this, 8, value);
};


/**
 * optional google.protobuf.Timestamp completion_time = 9;
 * @return {?proto.google.protobuf.Timestamp}
 */
proto.quicksilver.interchainstaking.v1.WithdrawalRecord.prototype.getCompletionTime = function() {
  return /** @type{?proto.google.protobuf.Timestamp} */ (
    jspb.Message.getWrapperField(this, proto.google.protobuf.Timestamp, 9));
};


/**
 * @param {?proto.google.protobuf.Timestamp|undefined} value
 * @return {!proto.quicksilver.interchainstaking.v1.WithdrawalRecord} returns this
*/
proto.quicksilver.interchainstaking.v1.WithdrawalRecord.prototype.setCompletionTime = function(value) {
  return jspb.Message.setWrapperField(this, 9, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.quicksilver.interchainstaking.v1.WithdrawalRecord} returns this
 */
proto.quicksilver.interchainstaking.v1.WithdrawalRecord.prototype.clearCompletionTime = function() {
  return this.setCompletionTime(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.quicksilver.interchainstaking.v1.WithdrawalRecord.prototype.hasCompletionTime = function() {
  return jspb.Message.getField(this, 9) != null;
};


/**
 * optional bool requeued = 10;
 * @return {boolean}
 */
proto.quicksilver.interchainstaking.v1.WithdrawalRecord.prototype.getRequeued = function() {
  return /** @type {boolean} */ (jspb.Message.getBooleanFieldWithDefault(this, 10, false));
};


/**
 * @param {boolean} value
 * @return {!proto.quicksilver.interchainstaking.v1.WithdrawalRecord} returns this
 */
proto.quicksilver.interchainstaking.v1.WithdrawalRecord.prototype.setRequeued = function(value) {
  return jspb.Message.setProto3BooleanField(this, 10, value);
};

