// source: osmosis/pool-incentives/v1beta1/genesis.proto
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

goog.provide('proto.osmosis.poolincentives.v1beta1.GenesisState');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.google.protobuf.Duration');
goog.require('proto.osmosis.poolincentives.v1beta1.DistrInfo');
goog.require('proto.osmosis.poolincentives.v1beta1.Params');
goog.require('proto.osmosis.poolincentives.v1beta1.PoolToGauges');

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
proto.osmosis.poolincentives.v1beta1.GenesisState = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.osmosis.poolincentives.v1beta1.GenesisState.repeatedFields_, null);
};
goog.inherits(proto.osmosis.poolincentives.v1beta1.GenesisState, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.osmosis.poolincentives.v1beta1.GenesisState.displayName = 'proto.osmosis.poolincentives.v1beta1.GenesisState';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.osmosis.poolincentives.v1beta1.GenesisState.repeatedFields_ = [2];



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
proto.osmosis.poolincentives.v1beta1.GenesisState.prototype.toObject = function(opt_includeInstance) {
  return proto.osmosis.poolincentives.v1beta1.GenesisState.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.osmosis.poolincentives.v1beta1.GenesisState} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.osmosis.poolincentives.v1beta1.GenesisState.toObject = function(includeInstance, msg) {
  var f, obj = {
    params: (f = msg.getParams()) && proto.osmosis.poolincentives.v1beta1.Params.toObject(includeInstance, f),
    lockableDurationsList: jspb.Message.toObjectList(msg.getLockableDurationsList(),
    proto.google.protobuf.Duration.toObject, includeInstance),
    distrInfo: (f = msg.getDistrInfo()) && proto.osmosis.poolincentives.v1beta1.DistrInfo.toObject(includeInstance, f),
    poolToGauges: (f = msg.getPoolToGauges()) && proto.osmosis.poolincentives.v1beta1.PoolToGauges.toObject(includeInstance, f)
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
 * @return {!proto.osmosis.poolincentives.v1beta1.GenesisState}
 */
proto.osmosis.poolincentives.v1beta1.GenesisState.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.osmosis.poolincentives.v1beta1.GenesisState;
  return proto.osmosis.poolincentives.v1beta1.GenesisState.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.osmosis.poolincentives.v1beta1.GenesisState} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.osmosis.poolincentives.v1beta1.GenesisState}
 */
proto.osmosis.poolincentives.v1beta1.GenesisState.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.osmosis.poolincentives.v1beta1.Params;
      reader.readMessage(value,proto.osmosis.poolincentives.v1beta1.Params.deserializeBinaryFromReader);
      msg.setParams(value);
      break;
    case 2:
      var value = new proto.google.protobuf.Duration;
      reader.readMessage(value,proto.google.protobuf.Duration.deserializeBinaryFromReader);
      msg.addLockableDurations(value);
      break;
    case 3:
      var value = new proto.osmosis.poolincentives.v1beta1.DistrInfo;
      reader.readMessage(value,proto.osmosis.poolincentives.v1beta1.DistrInfo.deserializeBinaryFromReader);
      msg.setDistrInfo(value);
      break;
    case 4:
      var value = new proto.osmosis.poolincentives.v1beta1.PoolToGauges;
      reader.readMessage(value,proto.osmosis.poolincentives.v1beta1.PoolToGauges.deserializeBinaryFromReader);
      msg.setPoolToGauges(value);
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
proto.osmosis.poolincentives.v1beta1.GenesisState.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.osmosis.poolincentives.v1beta1.GenesisState.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.osmosis.poolincentives.v1beta1.GenesisState} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.osmosis.poolincentives.v1beta1.GenesisState.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getParams();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.osmosis.poolincentives.v1beta1.Params.serializeBinaryToWriter
    );
  }
  f = message.getLockableDurationsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      2,
      f,
      proto.google.protobuf.Duration.serializeBinaryToWriter
    );
  }
  f = message.getDistrInfo();
  if (f != null) {
    writer.writeMessage(
      3,
      f,
      proto.osmosis.poolincentives.v1beta1.DistrInfo.serializeBinaryToWriter
    );
  }
  f = message.getPoolToGauges();
  if (f != null) {
    writer.writeMessage(
      4,
      f,
      proto.osmosis.poolincentives.v1beta1.PoolToGauges.serializeBinaryToWriter
    );
  }
};


/**
 * optional Params params = 1;
 * @return {?proto.osmosis.poolincentives.v1beta1.Params}
 */
proto.osmosis.poolincentives.v1beta1.GenesisState.prototype.getParams = function() {
  return /** @type{?proto.osmosis.poolincentives.v1beta1.Params} */ (
    jspb.Message.getWrapperField(this, proto.osmosis.poolincentives.v1beta1.Params, 1));
};


/**
 * @param {?proto.osmosis.poolincentives.v1beta1.Params|undefined} value
 * @return {!proto.osmosis.poolincentives.v1beta1.GenesisState} returns this
*/
proto.osmosis.poolincentives.v1beta1.GenesisState.prototype.setParams = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.osmosis.poolincentives.v1beta1.GenesisState} returns this
 */
proto.osmosis.poolincentives.v1beta1.GenesisState.prototype.clearParams = function() {
  return this.setParams(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.osmosis.poolincentives.v1beta1.GenesisState.prototype.hasParams = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * repeated google.protobuf.Duration lockable_durations = 2;
 * @return {!Array<!proto.google.protobuf.Duration>}
 */
proto.osmosis.poolincentives.v1beta1.GenesisState.prototype.getLockableDurationsList = function() {
  return /** @type{!Array<!proto.google.protobuf.Duration>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.google.protobuf.Duration, 2));
};


/**
 * @param {!Array<!proto.google.protobuf.Duration>} value
 * @return {!proto.osmosis.poolincentives.v1beta1.GenesisState} returns this
*/
proto.osmosis.poolincentives.v1beta1.GenesisState.prototype.setLockableDurationsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 2, value);
};


/**
 * @param {!proto.google.protobuf.Duration=} opt_value
 * @param {number=} opt_index
 * @return {!proto.google.protobuf.Duration}
 */
proto.osmosis.poolincentives.v1beta1.GenesisState.prototype.addLockableDurations = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 2, opt_value, proto.google.protobuf.Duration, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.osmosis.poolincentives.v1beta1.GenesisState} returns this
 */
proto.osmosis.poolincentives.v1beta1.GenesisState.prototype.clearLockableDurationsList = function() {
  return this.setLockableDurationsList([]);
};


/**
 * optional DistrInfo distr_info = 3;
 * @return {?proto.osmosis.poolincentives.v1beta1.DistrInfo}
 */
proto.osmosis.poolincentives.v1beta1.GenesisState.prototype.getDistrInfo = function() {
  return /** @type{?proto.osmosis.poolincentives.v1beta1.DistrInfo} */ (
    jspb.Message.getWrapperField(this, proto.osmosis.poolincentives.v1beta1.DistrInfo, 3));
};


/**
 * @param {?proto.osmosis.poolincentives.v1beta1.DistrInfo|undefined} value
 * @return {!proto.osmosis.poolincentives.v1beta1.GenesisState} returns this
*/
proto.osmosis.poolincentives.v1beta1.GenesisState.prototype.setDistrInfo = function(value) {
  return jspb.Message.setWrapperField(this, 3, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.osmosis.poolincentives.v1beta1.GenesisState} returns this
 */
proto.osmosis.poolincentives.v1beta1.GenesisState.prototype.clearDistrInfo = function() {
  return this.setDistrInfo(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.osmosis.poolincentives.v1beta1.GenesisState.prototype.hasDistrInfo = function() {
  return jspb.Message.getField(this, 3) != null;
};


/**
 * optional PoolToGauges pool_to_gauges = 4;
 * @return {?proto.osmosis.poolincentives.v1beta1.PoolToGauges}
 */
proto.osmosis.poolincentives.v1beta1.GenesisState.prototype.getPoolToGauges = function() {
  return /** @type{?proto.osmosis.poolincentives.v1beta1.PoolToGauges} */ (
    jspb.Message.getWrapperField(this, proto.osmosis.poolincentives.v1beta1.PoolToGauges, 4));
};


/**
 * @param {?proto.osmosis.poolincentives.v1beta1.PoolToGauges|undefined} value
 * @return {!proto.osmosis.poolincentives.v1beta1.GenesisState} returns this
*/
proto.osmosis.poolincentives.v1beta1.GenesisState.prototype.setPoolToGauges = function(value) {
  return jspb.Message.setWrapperField(this, 4, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.osmosis.poolincentives.v1beta1.GenesisState} returns this
 */
proto.osmosis.poolincentives.v1beta1.GenesisState.prototype.clearPoolToGauges = function() {
  return this.setPoolToGauges(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.osmosis.poolincentives.v1beta1.GenesisState.prototype.hasPoolToGauges = function() {
  return jspb.Message.getField(this, 4) != null;
};


