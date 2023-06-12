// source: umee/incentive/v1/query.proto
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

goog.provide('proto.umee.incentive.v1.QueryAccountBondsResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.cosmos.base.v1beta1.Coin');
goog.require('proto.umee.incentive.v1.Unbonding');

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
proto.umee.incentive.v1.QueryAccountBondsResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.umee.incentive.v1.QueryAccountBondsResponse.repeatedFields_, null);
};
goog.inherits(proto.umee.incentive.v1.QueryAccountBondsResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.umee.incentive.v1.QueryAccountBondsResponse.displayName = 'proto.umee.incentive.v1.QueryAccountBondsResponse';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.umee.incentive.v1.QueryAccountBondsResponse.repeatedFields_ = [1,2,3];



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
proto.umee.incentive.v1.QueryAccountBondsResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.umee.incentive.v1.QueryAccountBondsResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.umee.incentive.v1.QueryAccountBondsResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.umee.incentive.v1.QueryAccountBondsResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    bondedList: jspb.Message.toObjectList(msg.getBondedList(),
    proto.cosmos.base.v1beta1.Coin.toObject, includeInstance),
    unbondingList: jspb.Message.toObjectList(msg.getUnbondingList(),
    proto.cosmos.base.v1beta1.Coin.toObject, includeInstance),
    unbondingsList: jspb.Message.toObjectList(msg.getUnbondingsList(),
    proto.umee.incentive.v1.Unbonding.toObject, includeInstance)
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
 * @return {!proto.umee.incentive.v1.QueryAccountBondsResponse}
 */
proto.umee.incentive.v1.QueryAccountBondsResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.umee.incentive.v1.QueryAccountBondsResponse;
  return proto.umee.incentive.v1.QueryAccountBondsResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.umee.incentive.v1.QueryAccountBondsResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.umee.incentive.v1.QueryAccountBondsResponse}
 */
proto.umee.incentive.v1.QueryAccountBondsResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.cosmos.base.v1beta1.Coin;
      reader.readMessage(value,proto.cosmos.base.v1beta1.Coin.deserializeBinaryFromReader);
      msg.addBonded(value);
      break;
    case 2:
      var value = new proto.cosmos.base.v1beta1.Coin;
      reader.readMessage(value,proto.cosmos.base.v1beta1.Coin.deserializeBinaryFromReader);
      msg.addUnbonding(value);
      break;
    case 3:
      var value = new proto.umee.incentive.v1.Unbonding;
      reader.readMessage(value,proto.umee.incentive.v1.Unbonding.deserializeBinaryFromReader);
      msg.addUnbondings(value);
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
proto.umee.incentive.v1.QueryAccountBondsResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.umee.incentive.v1.QueryAccountBondsResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.umee.incentive.v1.QueryAccountBondsResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.umee.incentive.v1.QueryAccountBondsResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getBondedList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      1,
      f,
      proto.cosmos.base.v1beta1.Coin.serializeBinaryToWriter
    );
  }
  f = message.getUnbondingList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      2,
      f,
      proto.cosmos.base.v1beta1.Coin.serializeBinaryToWriter
    );
  }
  f = message.getUnbondingsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      3,
      f,
      proto.umee.incentive.v1.Unbonding.serializeBinaryToWriter
    );
  }
};


/**
 * repeated cosmos.base.v1beta1.Coin bonded = 1;
 * @return {!Array<!proto.cosmos.base.v1beta1.Coin>}
 */
proto.umee.incentive.v1.QueryAccountBondsResponse.prototype.getBondedList = function() {
  return /** @type{!Array<!proto.cosmos.base.v1beta1.Coin>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.cosmos.base.v1beta1.Coin, 1));
};


/**
 * @param {!Array<!proto.cosmos.base.v1beta1.Coin>} value
 * @return {!proto.umee.incentive.v1.QueryAccountBondsResponse} returns this
*/
proto.umee.incentive.v1.QueryAccountBondsResponse.prototype.setBondedList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 1, value);
};


/**
 * @param {!proto.cosmos.base.v1beta1.Coin=} opt_value
 * @param {number=} opt_index
 * @return {!proto.cosmos.base.v1beta1.Coin}
 */
proto.umee.incentive.v1.QueryAccountBondsResponse.prototype.addBonded = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 1, opt_value, proto.cosmos.base.v1beta1.Coin, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.umee.incentive.v1.QueryAccountBondsResponse} returns this
 */
proto.umee.incentive.v1.QueryAccountBondsResponse.prototype.clearBondedList = function() {
  return this.setBondedList([]);
};


/**
 * repeated cosmos.base.v1beta1.Coin unbonding = 2;
 * @return {!Array<!proto.cosmos.base.v1beta1.Coin>}
 */
proto.umee.incentive.v1.QueryAccountBondsResponse.prototype.getUnbondingList = function() {
  return /** @type{!Array<!proto.cosmos.base.v1beta1.Coin>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.cosmos.base.v1beta1.Coin, 2));
};


/**
 * @param {!Array<!proto.cosmos.base.v1beta1.Coin>} value
 * @return {!proto.umee.incentive.v1.QueryAccountBondsResponse} returns this
*/
proto.umee.incentive.v1.QueryAccountBondsResponse.prototype.setUnbondingList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 2, value);
};


/**
 * @param {!proto.cosmos.base.v1beta1.Coin=} opt_value
 * @param {number=} opt_index
 * @return {!proto.cosmos.base.v1beta1.Coin}
 */
proto.umee.incentive.v1.QueryAccountBondsResponse.prototype.addUnbonding = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 2, opt_value, proto.cosmos.base.v1beta1.Coin, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.umee.incentive.v1.QueryAccountBondsResponse} returns this
 */
proto.umee.incentive.v1.QueryAccountBondsResponse.prototype.clearUnbondingList = function() {
  return this.setUnbondingList([]);
};


/**
 * repeated Unbonding unbondings = 3;
 * @return {!Array<!proto.umee.incentive.v1.Unbonding>}
 */
proto.umee.incentive.v1.QueryAccountBondsResponse.prototype.getUnbondingsList = function() {
  return /** @type{!Array<!proto.umee.incentive.v1.Unbonding>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.umee.incentive.v1.Unbonding, 3));
};


/**
 * @param {!Array<!proto.umee.incentive.v1.Unbonding>} value
 * @return {!proto.umee.incentive.v1.QueryAccountBondsResponse} returns this
*/
proto.umee.incentive.v1.QueryAccountBondsResponse.prototype.setUnbondingsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 3, value);
};


/**
 * @param {!proto.umee.incentive.v1.Unbonding=} opt_value
 * @param {number=} opt_index
 * @return {!proto.umee.incentive.v1.Unbonding}
 */
proto.umee.incentive.v1.QueryAccountBondsResponse.prototype.addUnbondings = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 3, opt_value, proto.umee.incentive.v1.Unbonding, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.umee.incentive.v1.QueryAccountBondsResponse} returns this
 */
proto.umee.incentive.v1.QueryAccountBondsResponse.prototype.clearUnbondingsList = function() {
  return this.setUnbondingsList([]);
};


