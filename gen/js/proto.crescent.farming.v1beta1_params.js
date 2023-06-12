// source: crescent/farming/v1beta1/farming.proto
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

goog.provide('proto.crescent.farming.v1beta1.Params');

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
proto.crescent.farming.v1beta1.Params = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.crescent.farming.v1beta1.Params.repeatedFields_, null);
};
goog.inherits(proto.crescent.farming.v1beta1.Params, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.crescent.farming.v1beta1.Params.displayName = 'proto.crescent.farming.v1beta1.Params';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.crescent.farming.v1beta1.Params.repeatedFields_ = [1];



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
proto.crescent.farming.v1beta1.Params.prototype.toObject = function(opt_includeInstance) {
  return proto.crescent.farming.v1beta1.Params.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.crescent.farming.v1beta1.Params} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.crescent.farming.v1beta1.Params.toObject = function(includeInstance, msg) {
  var f, obj = {
    privatePlanCreationFeeList: jspb.Message.toObjectList(msg.getPrivatePlanCreationFeeList(),
    proto.cosmos.base.v1beta1.Coin.toObject, includeInstance),
    nextEpochDays: jspb.Message.getFieldWithDefault(msg, 2, 0),
    farmingFeeCollector: jspb.Message.getFieldWithDefault(msg, 3, ""),
    delayedStakingGasFee: jspb.Message.getFieldWithDefault(msg, 4, 0),
    maxNumPrivatePlans: jspb.Message.getFieldWithDefault(msg, 5, 0)
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
 * @return {!proto.crescent.farming.v1beta1.Params}
 */
proto.crescent.farming.v1beta1.Params.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.crescent.farming.v1beta1.Params;
  return proto.crescent.farming.v1beta1.Params.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.crescent.farming.v1beta1.Params} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.crescent.farming.v1beta1.Params}
 */
proto.crescent.farming.v1beta1.Params.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.cosmos.base.v1beta1.Coin;
      reader.readMessage(value,proto.cosmos.base.v1beta1.Coin.deserializeBinaryFromReader);
      msg.addPrivatePlanCreationFee(value);
      break;
    case 2:
      var value = /** @type {number} */ (reader.readUint32());
      msg.setNextEpochDays(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setFarmingFeeCollector(value);
      break;
    case 4:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setDelayedStakingGasFee(value);
      break;
    case 5:
      var value = /** @type {number} */ (reader.readUint32());
      msg.setMaxNumPrivatePlans(value);
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
proto.crescent.farming.v1beta1.Params.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.crescent.farming.v1beta1.Params.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.crescent.farming.v1beta1.Params} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.crescent.farming.v1beta1.Params.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getPrivatePlanCreationFeeList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      1,
      f,
      proto.cosmos.base.v1beta1.Coin.serializeBinaryToWriter
    );
  }
  f = message.getNextEpochDays();
  if (f !== 0) {
    writer.writeUint32(
      2,
      f
    );
  }
  f = message.getFarmingFeeCollector();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getDelayedStakingGasFee();
  if (f !== 0) {
    writer.writeUint64(
      4,
      f
    );
  }
  f = message.getMaxNumPrivatePlans();
  if (f !== 0) {
    writer.writeUint32(
      5,
      f
    );
  }
};


/**
 * repeated cosmos.base.v1beta1.Coin private_plan_creation_fee = 1;
 * @return {!Array<!proto.cosmos.base.v1beta1.Coin>}
 */
proto.crescent.farming.v1beta1.Params.prototype.getPrivatePlanCreationFeeList = function() {
  return /** @type{!Array<!proto.cosmos.base.v1beta1.Coin>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.cosmos.base.v1beta1.Coin, 1));
};


/**
 * @param {!Array<!proto.cosmos.base.v1beta1.Coin>} value
 * @return {!proto.crescent.farming.v1beta1.Params} returns this
*/
proto.crescent.farming.v1beta1.Params.prototype.setPrivatePlanCreationFeeList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 1, value);
};


/**
 * @param {!proto.cosmos.base.v1beta1.Coin=} opt_value
 * @param {number=} opt_index
 * @return {!proto.cosmos.base.v1beta1.Coin}
 */
proto.crescent.farming.v1beta1.Params.prototype.addPrivatePlanCreationFee = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 1, opt_value, proto.cosmos.base.v1beta1.Coin, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.crescent.farming.v1beta1.Params} returns this
 */
proto.crescent.farming.v1beta1.Params.prototype.clearPrivatePlanCreationFeeList = function() {
  return this.setPrivatePlanCreationFeeList([]);
};


/**
 * optional uint32 next_epoch_days = 2;
 * @return {number}
 */
proto.crescent.farming.v1beta1.Params.prototype.getNextEpochDays = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 2, 0));
};


/**
 * @param {number} value
 * @return {!proto.crescent.farming.v1beta1.Params} returns this
 */
proto.crescent.farming.v1beta1.Params.prototype.setNextEpochDays = function(value) {
  return jspb.Message.setProto3IntField(this, 2, value);
};


/**
 * optional string farming_fee_collector = 3;
 * @return {string}
 */
proto.crescent.farming.v1beta1.Params.prototype.getFarmingFeeCollector = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.crescent.farming.v1beta1.Params} returns this
 */
proto.crescent.farming.v1beta1.Params.prototype.setFarmingFeeCollector = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * optional uint64 delayed_staking_gas_fee = 4;
 * @return {number}
 */
proto.crescent.farming.v1beta1.Params.prototype.getDelayedStakingGasFee = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 4, 0));
};


/**
 * @param {number} value
 * @return {!proto.crescent.farming.v1beta1.Params} returns this
 */
proto.crescent.farming.v1beta1.Params.prototype.setDelayedStakingGasFee = function(value) {
  return jspb.Message.setProto3IntField(this, 4, value);
};


/**
 * optional uint32 max_num_private_plans = 5;
 * @return {number}
 */
proto.crescent.farming.v1beta1.Params.prototype.getMaxNumPrivatePlans = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 5, 0));
};


/**
 * @param {number} value
 * @return {!proto.crescent.farming.v1beta1.Params} returns this
 */
proto.crescent.farming.v1beta1.Params.prototype.setMaxNumPrivatePlans = function(value) {
  return jspb.Message.setProto3IntField(this, 5, value);
};


