// source: osmosis/gamm/pool-models/balancer/balancerPool.proto
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

goog.provide('proto.osmosis.gamm.v1beta1.Pool');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.cosmos.base.v1beta1.Coin');
goog.require('proto.osmosis.gamm.v1beta1.PoolAsset');
goog.require('proto.osmosis.gamm.v1beta1.PoolParams');

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
proto.osmosis.gamm.v1beta1.Pool = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.osmosis.gamm.v1beta1.Pool.repeatedFields_, null);
};
goog.inherits(proto.osmosis.gamm.v1beta1.Pool, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.osmosis.gamm.v1beta1.Pool.displayName = 'proto.osmosis.gamm.v1beta1.Pool';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.osmosis.gamm.v1beta1.Pool.repeatedFields_ = [6];



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
proto.osmosis.gamm.v1beta1.Pool.prototype.toObject = function(opt_includeInstance) {
  return proto.osmosis.gamm.v1beta1.Pool.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.osmosis.gamm.v1beta1.Pool} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.osmosis.gamm.v1beta1.Pool.toObject = function(includeInstance, msg) {
  var f, obj = {
    address: jspb.Message.getFieldWithDefault(msg, 1, ""),
    id: jspb.Message.getFieldWithDefault(msg, 2, 0),
    poolParams: (f = msg.getPoolParams()) && proto.osmosis.gamm.v1beta1.PoolParams.toObject(includeInstance, f),
    futurePoolGovernor: jspb.Message.getFieldWithDefault(msg, 4, ""),
    totalShares: (f = msg.getTotalShares()) && proto.cosmos.base.v1beta1.Coin.toObject(includeInstance, f),
    poolAssetsList: jspb.Message.toObjectList(msg.getPoolAssetsList(),
    proto.osmosis.gamm.v1beta1.PoolAsset.toObject, includeInstance),
    totalWeight: jspb.Message.getFieldWithDefault(msg, 7, "")
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
 * @return {!proto.osmosis.gamm.v1beta1.Pool}
 */
proto.osmosis.gamm.v1beta1.Pool.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.osmosis.gamm.v1beta1.Pool;
  return proto.osmosis.gamm.v1beta1.Pool.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.osmosis.gamm.v1beta1.Pool} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.osmosis.gamm.v1beta1.Pool}
 */
proto.osmosis.gamm.v1beta1.Pool.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setAddress(value);
      break;
    case 2:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setId(value);
      break;
    case 3:
      var value = new proto.osmosis.gamm.v1beta1.PoolParams;
      reader.readMessage(value,proto.osmosis.gamm.v1beta1.PoolParams.deserializeBinaryFromReader);
      msg.setPoolParams(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.setFuturePoolGovernor(value);
      break;
    case 5:
      var value = new proto.cosmos.base.v1beta1.Coin;
      reader.readMessage(value,proto.cosmos.base.v1beta1.Coin.deserializeBinaryFromReader);
      msg.setTotalShares(value);
      break;
    case 6:
      var value = new proto.osmosis.gamm.v1beta1.PoolAsset;
      reader.readMessage(value,proto.osmosis.gamm.v1beta1.PoolAsset.deserializeBinaryFromReader);
      msg.addPoolAssets(value);
      break;
    case 7:
      var value = /** @type {string} */ (reader.readString());
      msg.setTotalWeight(value);
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
proto.osmosis.gamm.v1beta1.Pool.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.osmosis.gamm.v1beta1.Pool.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.osmosis.gamm.v1beta1.Pool} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.osmosis.gamm.v1beta1.Pool.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getAddress();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getId();
  if (f !== 0) {
    writer.writeUint64(
      2,
      f
    );
  }
  f = message.getPoolParams();
  if (f != null) {
    writer.writeMessage(
      3,
      f,
      proto.osmosis.gamm.v1beta1.PoolParams.serializeBinaryToWriter
    );
  }
  f = message.getFuturePoolGovernor();
  if (f.length > 0) {
    writer.writeString(
      4,
      f
    );
  }
  f = message.getTotalShares();
  if (f != null) {
    writer.writeMessage(
      5,
      f,
      proto.cosmos.base.v1beta1.Coin.serializeBinaryToWriter
    );
  }
  f = message.getPoolAssetsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      6,
      f,
      proto.osmosis.gamm.v1beta1.PoolAsset.serializeBinaryToWriter
    );
  }
  f = message.getTotalWeight();
  if (f.length > 0) {
    writer.writeString(
      7,
      f
    );
  }
};


/**
 * optional string address = 1;
 * @return {string}
 */
proto.osmosis.gamm.v1beta1.Pool.prototype.getAddress = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.osmosis.gamm.v1beta1.Pool} returns this
 */
proto.osmosis.gamm.v1beta1.Pool.prototype.setAddress = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional uint64 id = 2;
 * @return {number}
 */
proto.osmosis.gamm.v1beta1.Pool.prototype.getId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 2, 0));
};


/**
 * @param {number} value
 * @return {!proto.osmosis.gamm.v1beta1.Pool} returns this
 */
proto.osmosis.gamm.v1beta1.Pool.prototype.setId = function(value) {
  return jspb.Message.setProto3IntField(this, 2, value);
};


/**
 * optional PoolParams pool_params = 3;
 * @return {?proto.osmosis.gamm.v1beta1.PoolParams}
 */
proto.osmosis.gamm.v1beta1.Pool.prototype.getPoolParams = function() {
  return /** @type{?proto.osmosis.gamm.v1beta1.PoolParams} */ (
    jspb.Message.getWrapperField(this, proto.osmosis.gamm.v1beta1.PoolParams, 3));
};


/**
 * @param {?proto.osmosis.gamm.v1beta1.PoolParams|undefined} value
 * @return {!proto.osmosis.gamm.v1beta1.Pool} returns this
*/
proto.osmosis.gamm.v1beta1.Pool.prototype.setPoolParams = function(value) {
  return jspb.Message.setWrapperField(this, 3, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.osmosis.gamm.v1beta1.Pool} returns this
 */
proto.osmosis.gamm.v1beta1.Pool.prototype.clearPoolParams = function() {
  return this.setPoolParams(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.osmosis.gamm.v1beta1.Pool.prototype.hasPoolParams = function() {
  return jspb.Message.getField(this, 3) != null;
};


/**
 * optional string future_pool_governor = 4;
 * @return {string}
 */
proto.osmosis.gamm.v1beta1.Pool.prototype.getFuturePoolGovernor = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * @param {string} value
 * @return {!proto.osmosis.gamm.v1beta1.Pool} returns this
 */
proto.osmosis.gamm.v1beta1.Pool.prototype.setFuturePoolGovernor = function(value) {
  return jspb.Message.setProto3StringField(this, 4, value);
};


/**
 * optional cosmos.base.v1beta1.Coin total_shares = 5;
 * @return {?proto.cosmos.base.v1beta1.Coin}
 */
proto.osmosis.gamm.v1beta1.Pool.prototype.getTotalShares = function() {
  return /** @type{?proto.cosmos.base.v1beta1.Coin} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.base.v1beta1.Coin, 5));
};


/**
 * @param {?proto.cosmos.base.v1beta1.Coin|undefined} value
 * @return {!proto.osmosis.gamm.v1beta1.Pool} returns this
*/
proto.osmosis.gamm.v1beta1.Pool.prototype.setTotalShares = function(value) {
  return jspb.Message.setWrapperField(this, 5, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.osmosis.gamm.v1beta1.Pool} returns this
 */
proto.osmosis.gamm.v1beta1.Pool.prototype.clearTotalShares = function() {
  return this.setTotalShares(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.osmosis.gamm.v1beta1.Pool.prototype.hasTotalShares = function() {
  return jspb.Message.getField(this, 5) != null;
};


/**
 * repeated PoolAsset pool_assets = 6;
 * @return {!Array<!proto.osmosis.gamm.v1beta1.PoolAsset>}
 */
proto.osmosis.gamm.v1beta1.Pool.prototype.getPoolAssetsList = function() {
  return /** @type{!Array<!proto.osmosis.gamm.v1beta1.PoolAsset>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.osmosis.gamm.v1beta1.PoolAsset, 6));
};


/**
 * @param {!Array<!proto.osmosis.gamm.v1beta1.PoolAsset>} value
 * @return {!proto.osmosis.gamm.v1beta1.Pool} returns this
*/
proto.osmosis.gamm.v1beta1.Pool.prototype.setPoolAssetsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 6, value);
};


/**
 * @param {!proto.osmosis.gamm.v1beta1.PoolAsset=} opt_value
 * @param {number=} opt_index
 * @return {!proto.osmosis.gamm.v1beta1.PoolAsset}
 */
proto.osmosis.gamm.v1beta1.Pool.prototype.addPoolAssets = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 6, opt_value, proto.osmosis.gamm.v1beta1.PoolAsset, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.osmosis.gamm.v1beta1.Pool} returns this
 */
proto.osmosis.gamm.v1beta1.Pool.prototype.clearPoolAssetsList = function() {
  return this.setPoolAssetsList([]);
};


/**
 * optional string total_weight = 7;
 * @return {string}
 */
proto.osmosis.gamm.v1beta1.Pool.prototype.getTotalWeight = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 7, ""));
};


/**
 * @param {string} value
 * @return {!proto.osmosis.gamm.v1beta1.Pool} returns this
 */
proto.osmosis.gamm.v1beta1.Pool.prototype.setTotalWeight = function(value) {
  return jspb.Message.setProto3StringField(this, 7, value);
};

