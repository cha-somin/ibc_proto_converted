// source: pstake/liquidstakeibc/v1beta1/msgs.proto
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

goog.provide('proto.pstake.liquidstakeibc.v1beta1.MsgLiquidStakeLSM');

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
proto.pstake.liquidstakeibc.v1beta1.MsgLiquidStakeLSM = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.pstake.liquidstakeibc.v1beta1.MsgLiquidStakeLSM.repeatedFields_, null);
};
goog.inherits(proto.pstake.liquidstakeibc.v1beta1.MsgLiquidStakeLSM, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.pstake.liquidstakeibc.v1beta1.MsgLiquidStakeLSM.displayName = 'proto.pstake.liquidstakeibc.v1beta1.MsgLiquidStakeLSM';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.pstake.liquidstakeibc.v1beta1.MsgLiquidStakeLSM.repeatedFields_ = [2];



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
proto.pstake.liquidstakeibc.v1beta1.MsgLiquidStakeLSM.prototype.toObject = function(opt_includeInstance) {
  return proto.pstake.liquidstakeibc.v1beta1.MsgLiquidStakeLSM.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.pstake.liquidstakeibc.v1beta1.MsgLiquidStakeLSM} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.pstake.liquidstakeibc.v1beta1.MsgLiquidStakeLSM.toObject = function(includeInstance, msg) {
  var f, obj = {
    delegatorAddress: jspb.Message.getFieldWithDefault(msg, 1, ""),
    delegationsList: jspb.Message.toObjectList(msg.getDelegationsList(),
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
 * @return {!proto.pstake.liquidstakeibc.v1beta1.MsgLiquidStakeLSM}
 */
proto.pstake.liquidstakeibc.v1beta1.MsgLiquidStakeLSM.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.pstake.liquidstakeibc.v1beta1.MsgLiquidStakeLSM;
  return proto.pstake.liquidstakeibc.v1beta1.MsgLiquidStakeLSM.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.pstake.liquidstakeibc.v1beta1.MsgLiquidStakeLSM} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.pstake.liquidstakeibc.v1beta1.MsgLiquidStakeLSM}
 */
proto.pstake.liquidstakeibc.v1beta1.MsgLiquidStakeLSM.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setDelegatorAddress(value);
      break;
    case 2:
      var value = new proto.cosmos.base.v1beta1.Coin;
      reader.readMessage(value,proto.cosmos.base.v1beta1.Coin.deserializeBinaryFromReader);
      msg.addDelegations(value);
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
proto.pstake.liquidstakeibc.v1beta1.MsgLiquidStakeLSM.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.pstake.liquidstakeibc.v1beta1.MsgLiquidStakeLSM.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.pstake.liquidstakeibc.v1beta1.MsgLiquidStakeLSM} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.pstake.liquidstakeibc.v1beta1.MsgLiquidStakeLSM.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getDelegatorAddress();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getDelegationsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      2,
      f,
      proto.cosmos.base.v1beta1.Coin.serializeBinaryToWriter
    );
  }
};


/**
 * optional string delegator_address = 1;
 * @return {string}
 */
proto.pstake.liquidstakeibc.v1beta1.MsgLiquidStakeLSM.prototype.getDelegatorAddress = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.pstake.liquidstakeibc.v1beta1.MsgLiquidStakeLSM} returns this
 */
proto.pstake.liquidstakeibc.v1beta1.MsgLiquidStakeLSM.prototype.setDelegatorAddress = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * repeated cosmos.base.v1beta1.Coin delegations = 2;
 * @return {!Array<!proto.cosmos.base.v1beta1.Coin>}
 */
proto.pstake.liquidstakeibc.v1beta1.MsgLiquidStakeLSM.prototype.getDelegationsList = function() {
  return /** @type{!Array<!proto.cosmos.base.v1beta1.Coin>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.cosmos.base.v1beta1.Coin, 2));
};


/**
 * @param {!Array<!proto.cosmos.base.v1beta1.Coin>} value
 * @return {!proto.pstake.liquidstakeibc.v1beta1.MsgLiquidStakeLSM} returns this
*/
proto.pstake.liquidstakeibc.v1beta1.MsgLiquidStakeLSM.prototype.setDelegationsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 2, value);
};


/**
 * @param {!proto.cosmos.base.v1beta1.Coin=} opt_value
 * @param {number=} opt_index
 * @return {!proto.cosmos.base.v1beta1.Coin}
 */
proto.pstake.liquidstakeibc.v1beta1.MsgLiquidStakeLSM.prototype.addDelegations = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 2, opt_value, proto.cosmos.base.v1beta1.Coin, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.pstake.liquidstakeibc.v1beta1.MsgLiquidStakeLSM} returns this
 */
proto.pstake.liquidstakeibc.v1beta1.MsgLiquidStakeLSM.prototype.clearDelegationsList = function() {
  return this.setDelegationsList([]);
};

