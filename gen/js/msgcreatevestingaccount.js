// source: stargaze/alloc/v1beta1/tx.proto
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

goog.provide('proto.publicawesome.stargaze.alloc.v1beta1.MsgCreateVestingAccount');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.cosmos.base.v1beta1.Coin');

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
proto.publicawesome.stargaze.alloc.v1beta1.MsgCreateVestingAccount = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.publicawesome.stargaze.alloc.v1beta1.MsgCreateVestingAccount.repeatedFields_, null);
};
goog.inherits(proto.publicawesome.stargaze.alloc.v1beta1.MsgCreateVestingAccount, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.publicawesome.stargaze.alloc.v1beta1.MsgCreateVestingAccount.displayName = 'proto.publicawesome.stargaze.alloc.v1beta1.MsgCreateVestingAccount';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.publicawesome.stargaze.alloc.v1beta1.MsgCreateVestingAccount.repeatedFields_ = [3];



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
proto.publicawesome.stargaze.alloc.v1beta1.MsgCreateVestingAccount.prototype.toObject = function(opt_includeInstance) {
  return proto.publicawesome.stargaze.alloc.v1beta1.MsgCreateVestingAccount.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.publicawesome.stargaze.alloc.v1beta1.MsgCreateVestingAccount} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.publicawesome.stargaze.alloc.v1beta1.MsgCreateVestingAccount.toObject = function(includeInstance, msg) {
  var f, obj = {
    fromAddress: jspb.Message.getFieldWithDefault(msg, 1, ""),
    toAddress: jspb.Message.getFieldWithDefault(msg, 2, ""),
    amountList: jspb.Message.toObjectList(msg.getAmountList(),
    proto.cosmos.base.v1beta1.Coin.toObject, includeInstance),
    startTime: jspb.Message.getFieldWithDefault(msg, 4, 0),
    endTime: jspb.Message.getFieldWithDefault(msg, 5, 0),
    delayed: jspb.Message.getBooleanFieldWithDefault(msg, 6, false)
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
 * @return {!proto.publicawesome.stargaze.alloc.v1beta1.MsgCreateVestingAccount}
 */
proto.publicawesome.stargaze.alloc.v1beta1.MsgCreateVestingAccount.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.publicawesome.stargaze.alloc.v1beta1.MsgCreateVestingAccount;
  return proto.publicawesome.stargaze.alloc.v1beta1.MsgCreateVestingAccount.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.publicawesome.stargaze.alloc.v1beta1.MsgCreateVestingAccount} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.publicawesome.stargaze.alloc.v1beta1.MsgCreateVestingAccount}
 */
proto.publicawesome.stargaze.alloc.v1beta1.MsgCreateVestingAccount.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setFromAddress(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setToAddress(value);
      break;
    case 3:
      var value = new proto.cosmos.base.v1beta1.Coin;
      reader.readMessage(value,proto.cosmos.base.v1beta1.Coin.deserializeBinaryFromReader);
      msg.addAmount(value);
      break;
    case 4:
      var value = /** @type {number} */ (reader.readInt64());
      msg.setStartTime(value);
      break;
    case 5:
      var value = /** @type {number} */ (reader.readInt64());
      msg.setEndTime(value);
      break;
    case 6:
      var value = /** @type {boolean} */ (reader.readBool());
      msg.setDelayed(value);
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
proto.publicawesome.stargaze.alloc.v1beta1.MsgCreateVestingAccount.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.publicawesome.stargaze.alloc.v1beta1.MsgCreateVestingAccount.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.publicawesome.stargaze.alloc.v1beta1.MsgCreateVestingAccount} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.publicawesome.stargaze.alloc.v1beta1.MsgCreateVestingAccount.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getFromAddress();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getToAddress();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getAmountList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      3,
      f,
      proto.cosmos.base.v1beta1.Coin.serializeBinaryToWriter
    );
  }
  f = message.getStartTime();
  if (f !== 0) {
    writer.writeInt64(
      4,
      f
    );
  }
  f = message.getEndTime();
  if (f !== 0) {
    writer.writeInt64(
      5,
      f
    );
  }
  f = message.getDelayed();
  if (f) {
    writer.writeBool(
      6,
      f
    );
  }
};


/**
 * optional string from_address = 1;
 * @return {string}
 */
proto.publicawesome.stargaze.alloc.v1beta1.MsgCreateVestingAccount.prototype.getFromAddress = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.publicawesome.stargaze.alloc.v1beta1.MsgCreateVestingAccount} returns this
 */
proto.publicawesome.stargaze.alloc.v1beta1.MsgCreateVestingAccount.prototype.setFromAddress = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string to_address = 2;
 * @return {string}
 */
proto.publicawesome.stargaze.alloc.v1beta1.MsgCreateVestingAccount.prototype.getToAddress = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.publicawesome.stargaze.alloc.v1beta1.MsgCreateVestingAccount} returns this
 */
proto.publicawesome.stargaze.alloc.v1beta1.MsgCreateVestingAccount.prototype.setToAddress = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * repeated cosmos.base.v1beta1.Coin amount = 3;
 * @return {!Array<!proto.cosmos.base.v1beta1.Coin>}
 */
proto.publicawesome.stargaze.alloc.v1beta1.MsgCreateVestingAccount.prototype.getAmountList = function() {
  return /** @type{!Array<!proto.cosmos.base.v1beta1.Coin>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.cosmos.base.v1beta1.Coin, 3));
};


/**
 * @param {!Array<!proto.cosmos.base.v1beta1.Coin>} value
 * @return {!proto.publicawesome.stargaze.alloc.v1beta1.MsgCreateVestingAccount} returns this
*/
proto.publicawesome.stargaze.alloc.v1beta1.MsgCreateVestingAccount.prototype.setAmountList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 3, value);
};


/**
 * @param {!proto.cosmos.base.v1beta1.Coin=} opt_value
 * @param {number=} opt_index
 * @return {!proto.cosmos.base.v1beta1.Coin}
 */
proto.publicawesome.stargaze.alloc.v1beta1.MsgCreateVestingAccount.prototype.addAmount = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 3, opt_value, proto.cosmos.base.v1beta1.Coin, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.publicawesome.stargaze.alloc.v1beta1.MsgCreateVestingAccount} returns this
 */
proto.publicawesome.stargaze.alloc.v1beta1.MsgCreateVestingAccount.prototype.clearAmountList = function() {
  return this.setAmountList([]);
};


/**
 * optional int64 start_time = 4;
 * @return {number}
 */
proto.publicawesome.stargaze.alloc.v1beta1.MsgCreateVestingAccount.prototype.getStartTime = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 4, 0));
};


/**
 * @param {number} value
 * @return {!proto.publicawesome.stargaze.alloc.v1beta1.MsgCreateVestingAccount} returns this
 */
proto.publicawesome.stargaze.alloc.v1beta1.MsgCreateVestingAccount.prototype.setStartTime = function(value) {
  return jspb.Message.setProto3IntField(this, 4, value);
};


/**
 * optional int64 end_time = 5;
 * @return {number}
 */
proto.publicawesome.stargaze.alloc.v1beta1.MsgCreateVestingAccount.prototype.getEndTime = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 5, 0));
};


/**
 * @param {number} value
 * @return {!proto.publicawesome.stargaze.alloc.v1beta1.MsgCreateVestingAccount} returns this
 */
proto.publicawesome.stargaze.alloc.v1beta1.MsgCreateVestingAccount.prototype.setEndTime = function(value) {
  return jspb.Message.setProto3IntField(this, 5, value);
};


/**
 * optional bool delayed = 6;
 * @return {boolean}
 */
proto.publicawesome.stargaze.alloc.v1beta1.MsgCreateVestingAccount.prototype.getDelayed = function() {
  return /** @type {boolean} */ (jspb.Message.getBooleanFieldWithDefault(this, 6, false));
};


/**
 * @param {boolean} value
 * @return {!proto.publicawesome.stargaze.alloc.v1beta1.MsgCreateVestingAccount} returns this
 */
proto.publicawesome.stargaze.alloc.v1beta1.MsgCreateVestingAccount.prototype.setDelayed = function(value) {
  return jspb.Message.setProto3BooleanField(this, 6, value);
};


