// source: evmos/vesting/v1/query.proto
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

goog.provide('proto.evmos.vesting.v1.QueryBalancesResponse');

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
proto.evmos.vesting.v1.QueryBalancesResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.evmos.vesting.v1.QueryBalancesResponse.repeatedFields_, null);
};
goog.inherits(proto.evmos.vesting.v1.QueryBalancesResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.evmos.vesting.v1.QueryBalancesResponse.displayName = 'proto.evmos.vesting.v1.QueryBalancesResponse';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.evmos.vesting.v1.QueryBalancesResponse.repeatedFields_ = [1,2,3];



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
proto.evmos.vesting.v1.QueryBalancesResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.evmos.vesting.v1.QueryBalancesResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.evmos.vesting.v1.QueryBalancesResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.evmos.vesting.v1.QueryBalancesResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    lockedList: jspb.Message.toObjectList(msg.getLockedList(),
    proto.cosmos.base.v1beta1.Coin.toObject, includeInstance),
    unvestedList: jspb.Message.toObjectList(msg.getUnvestedList(),
    proto.cosmos.base.v1beta1.Coin.toObject, includeInstance),
    vestedList: jspb.Message.toObjectList(msg.getVestedList(),
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
 * @return {!proto.evmos.vesting.v1.QueryBalancesResponse}
 */
proto.evmos.vesting.v1.QueryBalancesResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.evmos.vesting.v1.QueryBalancesResponse;
  return proto.evmos.vesting.v1.QueryBalancesResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.evmos.vesting.v1.QueryBalancesResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.evmos.vesting.v1.QueryBalancesResponse}
 */
proto.evmos.vesting.v1.QueryBalancesResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.cosmos.base.v1beta1.Coin;
      reader.readMessage(value,proto.cosmos.base.v1beta1.Coin.deserializeBinaryFromReader);
      msg.addLocked(value);
      break;
    case 2:
      var value = new proto.cosmos.base.v1beta1.Coin;
      reader.readMessage(value,proto.cosmos.base.v1beta1.Coin.deserializeBinaryFromReader);
      msg.addUnvested(value);
      break;
    case 3:
      var value = new proto.cosmos.base.v1beta1.Coin;
      reader.readMessage(value,proto.cosmos.base.v1beta1.Coin.deserializeBinaryFromReader);
      msg.addVested(value);
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
proto.evmos.vesting.v1.QueryBalancesResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.evmos.vesting.v1.QueryBalancesResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.evmos.vesting.v1.QueryBalancesResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.evmos.vesting.v1.QueryBalancesResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getLockedList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      1,
      f,
      proto.cosmos.base.v1beta1.Coin.serializeBinaryToWriter
    );
  }
  f = message.getUnvestedList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      2,
      f,
      proto.cosmos.base.v1beta1.Coin.serializeBinaryToWriter
    );
  }
  f = message.getVestedList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      3,
      f,
      proto.cosmos.base.v1beta1.Coin.serializeBinaryToWriter
    );
  }
};


/**
 * repeated cosmos.base.v1beta1.Coin locked = 1;
 * @return {!Array<!proto.cosmos.base.v1beta1.Coin>}
 */
proto.evmos.vesting.v1.QueryBalancesResponse.prototype.getLockedList = function() {
  return /** @type{!Array<!proto.cosmos.base.v1beta1.Coin>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.cosmos.base.v1beta1.Coin, 1));
};


/**
 * @param {!Array<!proto.cosmos.base.v1beta1.Coin>} value
 * @return {!proto.evmos.vesting.v1.QueryBalancesResponse} returns this
*/
proto.evmos.vesting.v1.QueryBalancesResponse.prototype.setLockedList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 1, value);
};


/**
 * @param {!proto.cosmos.base.v1beta1.Coin=} opt_value
 * @param {number=} opt_index
 * @return {!proto.cosmos.base.v1beta1.Coin}
 */
proto.evmos.vesting.v1.QueryBalancesResponse.prototype.addLocked = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 1, opt_value, proto.cosmos.base.v1beta1.Coin, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.evmos.vesting.v1.QueryBalancesResponse} returns this
 */
proto.evmos.vesting.v1.QueryBalancesResponse.prototype.clearLockedList = function() {
  return this.setLockedList([]);
};


/**
 * repeated cosmos.base.v1beta1.Coin unvested = 2;
 * @return {!Array<!proto.cosmos.base.v1beta1.Coin>}
 */
proto.evmos.vesting.v1.QueryBalancesResponse.prototype.getUnvestedList = function() {
  return /** @type{!Array<!proto.cosmos.base.v1beta1.Coin>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.cosmos.base.v1beta1.Coin, 2));
};


/**
 * @param {!Array<!proto.cosmos.base.v1beta1.Coin>} value
 * @return {!proto.evmos.vesting.v1.QueryBalancesResponse} returns this
*/
proto.evmos.vesting.v1.QueryBalancesResponse.prototype.setUnvestedList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 2, value);
};


/**
 * @param {!proto.cosmos.base.v1beta1.Coin=} opt_value
 * @param {number=} opt_index
 * @return {!proto.cosmos.base.v1beta1.Coin}
 */
proto.evmos.vesting.v1.QueryBalancesResponse.prototype.addUnvested = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 2, opt_value, proto.cosmos.base.v1beta1.Coin, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.evmos.vesting.v1.QueryBalancesResponse} returns this
 */
proto.evmos.vesting.v1.QueryBalancesResponse.prototype.clearUnvestedList = function() {
  return this.setUnvestedList([]);
};


/**
 * repeated cosmos.base.v1beta1.Coin vested = 3;
 * @return {!Array<!proto.cosmos.base.v1beta1.Coin>}
 */
proto.evmos.vesting.v1.QueryBalancesResponse.prototype.getVestedList = function() {
  return /** @type{!Array<!proto.cosmos.base.v1beta1.Coin>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.cosmos.base.v1beta1.Coin, 3));
};


/**
 * @param {!Array<!proto.cosmos.base.v1beta1.Coin>} value
 * @return {!proto.evmos.vesting.v1.QueryBalancesResponse} returns this
*/
proto.evmos.vesting.v1.QueryBalancesResponse.prototype.setVestedList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 3, value);
};


/**
 * @param {!proto.cosmos.base.v1beta1.Coin=} opt_value
 * @param {number=} opt_index
 * @return {!proto.cosmos.base.v1beta1.Coin}
 */
proto.evmos.vesting.v1.QueryBalancesResponse.prototype.addVested = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 3, opt_value, proto.cosmos.base.v1beta1.Coin, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.evmos.vesting.v1.QueryBalancesResponse} returns this
 */
proto.evmos.vesting.v1.QueryBalancesResponse.prototype.clearVestedList = function() {
  return this.setVestedList([]);
};

