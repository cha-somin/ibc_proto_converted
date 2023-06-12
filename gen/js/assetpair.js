// source: comdex/asset/v1beta1/pair.proto
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

goog.provide('proto.comdex.asset.v1beta1.AssetPair');

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
proto.comdex.asset.v1beta1.AssetPair = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.comdex.asset.v1beta1.AssetPair, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.comdex.asset.v1beta1.AssetPair.displayName = 'proto.comdex.asset.v1beta1.AssetPair';
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
proto.comdex.asset.v1beta1.AssetPair.prototype.toObject = function(opt_includeInstance) {
  return proto.comdex.asset.v1beta1.AssetPair.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.comdex.asset.v1beta1.AssetPair} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.comdex.asset.v1beta1.AssetPair.toObject = function(includeInstance, msg) {
  var f, obj = {
    id: jspb.Message.getFieldWithDefault(msg, 1, 0),
    name: jspb.Message.getFieldWithDefault(msg, 2, ""),
    denom: jspb.Message.getFieldWithDefault(msg, 3, ""),
    decimals: jspb.Message.getFieldWithDefault(msg, 4, ""),
    isOnChain: jspb.Message.getBooleanFieldWithDefault(msg, 5, false),
    isOraclePriceRequired: jspb.Message.getBooleanFieldWithDefault(msg, 6, false),
    isCdpMintable: jspb.Message.getBooleanFieldWithDefault(msg, 7, false),
    assetOut: jspb.Message.getFieldWithDefault(msg, 8, 0)
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
 * @return {!proto.comdex.asset.v1beta1.AssetPair}
 */
proto.comdex.asset.v1beta1.AssetPair.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.comdex.asset.v1beta1.AssetPair;
  return proto.comdex.asset.v1beta1.AssetPair.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.comdex.asset.v1beta1.AssetPair} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.comdex.asset.v1beta1.AssetPair}
 */
proto.comdex.asset.v1beta1.AssetPair.deserializeBinaryFromReader = function(msg, reader) {
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
      msg.setName(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setDenom(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.setDecimals(value);
      break;
    case 5:
      var value = /** @type {boolean} */ (reader.readBool());
      msg.setIsOnChain(value);
      break;
    case 6:
      var value = /** @type {boolean} */ (reader.readBool());
      msg.setIsOraclePriceRequired(value);
      break;
    case 7:
      var value = /** @type {boolean} */ (reader.readBool());
      msg.setIsCdpMintable(value);
      break;
    case 8:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setAssetOut(value);
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
proto.comdex.asset.v1beta1.AssetPair.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.comdex.asset.v1beta1.AssetPair.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.comdex.asset.v1beta1.AssetPair} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.comdex.asset.v1beta1.AssetPair.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getId();
  if (f !== 0) {
    writer.writeUint64(
      1,
      f
    );
  }
  f = message.getName();
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
  f = message.getDecimals();
  if (f.length > 0) {
    writer.writeString(
      4,
      f
    );
  }
  f = message.getIsOnChain();
  if (f) {
    writer.writeBool(
      5,
      f
    );
  }
  f = message.getIsOraclePriceRequired();
  if (f) {
    writer.writeBool(
      6,
      f
    );
  }
  f = message.getIsCdpMintable();
  if (f) {
    writer.writeBool(
      7,
      f
    );
  }
  f = message.getAssetOut();
  if (f !== 0) {
    writer.writeUint64(
      8,
      f
    );
  }
};


/**
 * optional uint64 id = 1;
 * @return {number}
 */
proto.comdex.asset.v1beta1.AssetPair.prototype.getId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/**
 * @param {number} value
 * @return {!proto.comdex.asset.v1beta1.AssetPair} returns this
 */
proto.comdex.asset.v1beta1.AssetPair.prototype.setId = function(value) {
  return jspb.Message.setProto3IntField(this, 1, value);
};


/**
 * optional string name = 2;
 * @return {string}
 */
proto.comdex.asset.v1beta1.AssetPair.prototype.getName = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.comdex.asset.v1beta1.AssetPair} returns this
 */
proto.comdex.asset.v1beta1.AssetPair.prototype.setName = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional string denom = 3;
 * @return {string}
 */
proto.comdex.asset.v1beta1.AssetPair.prototype.getDenom = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.comdex.asset.v1beta1.AssetPair} returns this
 */
proto.comdex.asset.v1beta1.AssetPair.prototype.setDenom = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * optional string decimals = 4;
 * @return {string}
 */
proto.comdex.asset.v1beta1.AssetPair.prototype.getDecimals = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * @param {string} value
 * @return {!proto.comdex.asset.v1beta1.AssetPair} returns this
 */
proto.comdex.asset.v1beta1.AssetPair.prototype.setDecimals = function(value) {
  return jspb.Message.setProto3StringField(this, 4, value);
};


/**
 * optional bool is_on_chain = 5;
 * @return {boolean}
 */
proto.comdex.asset.v1beta1.AssetPair.prototype.getIsOnChain = function() {
  return /** @type {boolean} */ (jspb.Message.getBooleanFieldWithDefault(this, 5, false));
};


/**
 * @param {boolean} value
 * @return {!proto.comdex.asset.v1beta1.AssetPair} returns this
 */
proto.comdex.asset.v1beta1.AssetPair.prototype.setIsOnChain = function(value) {
  return jspb.Message.setProto3BooleanField(this, 5, value);
};


/**
 * optional bool is_oracle_price_required = 6;
 * @return {boolean}
 */
proto.comdex.asset.v1beta1.AssetPair.prototype.getIsOraclePriceRequired = function() {
  return /** @type {boolean} */ (jspb.Message.getBooleanFieldWithDefault(this, 6, false));
};


/**
 * @param {boolean} value
 * @return {!proto.comdex.asset.v1beta1.AssetPair} returns this
 */
proto.comdex.asset.v1beta1.AssetPair.prototype.setIsOraclePriceRequired = function(value) {
  return jspb.Message.setProto3BooleanField(this, 6, value);
};


/**
 * optional bool is_cdp_mintable = 7;
 * @return {boolean}
 */
proto.comdex.asset.v1beta1.AssetPair.prototype.getIsCdpMintable = function() {
  return /** @type {boolean} */ (jspb.Message.getBooleanFieldWithDefault(this, 7, false));
};


/**
 * @param {boolean} value
 * @return {!proto.comdex.asset.v1beta1.AssetPair} returns this
 */
proto.comdex.asset.v1beta1.AssetPair.prototype.setIsCdpMintable = function(value) {
  return jspb.Message.setProto3BooleanField(this, 7, value);
};


/**
 * optional uint64 asset_out = 8;
 * @return {number}
 */
proto.comdex.asset.v1beta1.AssetPair.prototype.getAssetOut = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 8, 0));
};


/**
 * @param {number} value
 * @return {!proto.comdex.asset.v1beta1.AssetPair} returns this
 */
proto.comdex.asset.v1beta1.AssetPair.prototype.setAssetOut = function(value) {
  return jspb.Message.setProto3IntField(this, 8, value);
};


