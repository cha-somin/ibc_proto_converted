// source: kava/swap/v1beta1/query.proto
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

goog.provide('proto.kava.swap.v1beta1.DepositResponse');

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
proto.kava.swap.v1beta1.DepositResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.kava.swap.v1beta1.DepositResponse.repeatedFields_, null);
};
goog.inherits(proto.kava.swap.v1beta1.DepositResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.kava.swap.v1beta1.DepositResponse.displayName = 'proto.kava.swap.v1beta1.DepositResponse';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.kava.swap.v1beta1.DepositResponse.repeatedFields_ = [4];



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
proto.kava.swap.v1beta1.DepositResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.kava.swap.v1beta1.DepositResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.kava.swap.v1beta1.DepositResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.kava.swap.v1beta1.DepositResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    depositor: jspb.Message.getFieldWithDefault(msg, 1, ""),
    poolId: jspb.Message.getFieldWithDefault(msg, 2, ""),
    sharesOwned: jspb.Message.getFieldWithDefault(msg, 3, ""),
    sharesValueList: jspb.Message.toObjectList(msg.getSharesValueList(),
    proto.cosmos.base.v1beta1.Coin.toObject, includeInstance)
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
 * @return {!proto.kava.swap.v1beta1.DepositResponse}
 */
proto.kava.swap.v1beta1.DepositResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.kava.swap.v1beta1.DepositResponse;
  return proto.kava.swap.v1beta1.DepositResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.kava.swap.v1beta1.DepositResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.kava.swap.v1beta1.DepositResponse}
 */
proto.kava.swap.v1beta1.DepositResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setDepositor(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setPoolId(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setSharesOwned(value);
      break;
    case 4:
      var value = new proto.cosmos.base.v1beta1.Coin;
      reader.readMessage(value,proto.cosmos.base.v1beta1.Coin.deserializeBinaryFromReader);
      msg.addSharesValue(value);
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
proto.kava.swap.v1beta1.DepositResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.kava.swap.v1beta1.DepositResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.kava.swap.v1beta1.DepositResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.kava.swap.v1beta1.DepositResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getDepositor();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getPoolId();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getSharesOwned();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getSharesValueList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      4,
      f,
      proto.cosmos.base.v1beta1.Coin.serializeBinaryToWriter
    );
  }
};


/**
 * optional string depositor = 1;
 * @return {string}
 */
proto.kava.swap.v1beta1.DepositResponse.prototype.getDepositor = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.kava.swap.v1beta1.DepositResponse} returns this
 */
proto.kava.swap.v1beta1.DepositResponse.prototype.setDepositor = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string pool_id = 2;
 * @return {string}
 */
proto.kava.swap.v1beta1.DepositResponse.prototype.getPoolId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.kava.swap.v1beta1.DepositResponse} returns this
 */
proto.kava.swap.v1beta1.DepositResponse.prototype.setPoolId = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional string shares_owned = 3;
 * @return {string}
 */
proto.kava.swap.v1beta1.DepositResponse.prototype.getSharesOwned = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.kava.swap.v1beta1.DepositResponse} returns this
 */
proto.kava.swap.v1beta1.DepositResponse.prototype.setSharesOwned = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * repeated cosmos.base.v1beta1.Coin shares_value = 4;
 * @return {!Array<!proto.cosmos.base.v1beta1.Coin>}
 */
proto.kava.swap.v1beta1.DepositResponse.prototype.getSharesValueList = function() {
  return /** @type{!Array<!proto.cosmos.base.v1beta1.Coin>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.cosmos.base.v1beta1.Coin, 4));
};


/**
 * @param {!Array<!proto.cosmos.base.v1beta1.Coin>} value
 * @return {!proto.kava.swap.v1beta1.DepositResponse} returns this
*/
proto.kava.swap.v1beta1.DepositResponse.prototype.setSharesValueList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 4, value);
};


/**
 * @param {!proto.cosmos.base.v1beta1.Coin=} opt_value
 * @param {number=} opt_index
 * @return {!proto.cosmos.base.v1beta1.Coin}
 */
proto.kava.swap.v1beta1.DepositResponse.prototype.addSharesValue = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 4, opt_value, proto.cosmos.base.v1beta1.Coin, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.kava.swap.v1beta1.DepositResponse} returns this
 */
proto.kava.swap.v1beta1.DepositResponse.prototype.clearSharesValueList = function() {
  return this.setSharesValueList([]);
};


