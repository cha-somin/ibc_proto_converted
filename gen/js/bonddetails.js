// source: ixo/bonds/v1beta1/bonds.proto
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

goog.provide('proto.ixo.bonds.v1beta1.BondDetails');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.cosmos.base.v1beta1.Coin');
goog.require('proto.cosmos.base.v1beta1.DecCoin');

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
proto.ixo.bonds.v1beta1.BondDetails = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.ixo.bonds.v1beta1.BondDetails.repeatedFields_, null);
};
goog.inherits(proto.ixo.bonds.v1beta1.BondDetails, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.ixo.bonds.v1beta1.BondDetails.displayName = 'proto.ixo.bonds.v1beta1.BondDetails';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.ixo.bonds.v1beta1.BondDetails.repeatedFields_ = [2,4];



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
proto.ixo.bonds.v1beta1.BondDetails.prototype.toObject = function(opt_includeInstance) {
  return proto.ixo.bonds.v1beta1.BondDetails.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.ixo.bonds.v1beta1.BondDetails} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.ixo.bonds.v1beta1.BondDetails.toObject = function(includeInstance, msg) {
  var f, obj = {
    bondDid: jspb.Message.getFieldWithDefault(msg, 1, ""),
    spotPriceList: jspb.Message.toObjectList(msg.getSpotPriceList(),
    proto.cosmos.base.v1beta1.DecCoin.toObject, includeInstance),
    supply: (f = msg.getSupply()) && proto.cosmos.base.v1beta1.Coin.toObject(includeInstance, f),
    reserveList: jspb.Message.toObjectList(msg.getReserveList(),
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
 * @return {!proto.ixo.bonds.v1beta1.BondDetails}
 */
proto.ixo.bonds.v1beta1.BondDetails.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.ixo.bonds.v1beta1.BondDetails;
  return proto.ixo.bonds.v1beta1.BondDetails.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.ixo.bonds.v1beta1.BondDetails} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.ixo.bonds.v1beta1.BondDetails}
 */
proto.ixo.bonds.v1beta1.BondDetails.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setBondDid(value);
      break;
    case 2:
      var value = new proto.cosmos.base.v1beta1.DecCoin;
      reader.readMessage(value,proto.cosmos.base.v1beta1.DecCoin.deserializeBinaryFromReader);
      msg.addSpotPrice(value);
      break;
    case 3:
      var value = new proto.cosmos.base.v1beta1.Coin;
      reader.readMessage(value,proto.cosmos.base.v1beta1.Coin.deserializeBinaryFromReader);
      msg.setSupply(value);
      break;
    case 4:
      var value = new proto.cosmos.base.v1beta1.Coin;
      reader.readMessage(value,proto.cosmos.base.v1beta1.Coin.deserializeBinaryFromReader);
      msg.addReserve(value);
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
proto.ixo.bonds.v1beta1.BondDetails.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.ixo.bonds.v1beta1.BondDetails.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.ixo.bonds.v1beta1.BondDetails} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.ixo.bonds.v1beta1.BondDetails.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getBondDid();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getSpotPriceList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      2,
      f,
      proto.cosmos.base.v1beta1.DecCoin.serializeBinaryToWriter
    );
  }
  f = message.getSupply();
  if (f != null) {
    writer.writeMessage(
      3,
      f,
      proto.cosmos.base.v1beta1.Coin.serializeBinaryToWriter
    );
  }
  f = message.getReserveList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      4,
      f,
      proto.cosmos.base.v1beta1.Coin.serializeBinaryToWriter
    );
  }
};


/**
 * optional string bond_did = 1;
 * @return {string}
 */
proto.ixo.bonds.v1beta1.BondDetails.prototype.getBondDid = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.ixo.bonds.v1beta1.BondDetails} returns this
 */
proto.ixo.bonds.v1beta1.BondDetails.prototype.setBondDid = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * repeated cosmos.base.v1beta1.DecCoin spot_price = 2;
 * @return {!Array<!proto.cosmos.base.v1beta1.DecCoin>}
 */
proto.ixo.bonds.v1beta1.BondDetails.prototype.getSpotPriceList = function() {
  return /** @type{!Array<!proto.cosmos.base.v1beta1.DecCoin>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.cosmos.base.v1beta1.DecCoin, 2));
};


/**
 * @param {!Array<!proto.cosmos.base.v1beta1.DecCoin>} value
 * @return {!proto.ixo.bonds.v1beta1.BondDetails} returns this
*/
proto.ixo.bonds.v1beta1.BondDetails.prototype.setSpotPriceList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 2, value);
};


/**
 * @param {!proto.cosmos.base.v1beta1.DecCoin=} opt_value
 * @param {number=} opt_index
 * @return {!proto.cosmos.base.v1beta1.DecCoin}
 */
proto.ixo.bonds.v1beta1.BondDetails.prototype.addSpotPrice = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 2, opt_value, proto.cosmos.base.v1beta1.DecCoin, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.ixo.bonds.v1beta1.BondDetails} returns this
 */
proto.ixo.bonds.v1beta1.BondDetails.prototype.clearSpotPriceList = function() {
  return this.setSpotPriceList([]);
};


/**
 * optional cosmos.base.v1beta1.Coin supply = 3;
 * @return {?proto.cosmos.base.v1beta1.Coin}
 */
proto.ixo.bonds.v1beta1.BondDetails.prototype.getSupply = function() {
  return /** @type{?proto.cosmos.base.v1beta1.Coin} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.base.v1beta1.Coin, 3));
};


/**
 * @param {?proto.cosmos.base.v1beta1.Coin|undefined} value
 * @return {!proto.ixo.bonds.v1beta1.BondDetails} returns this
*/
proto.ixo.bonds.v1beta1.BondDetails.prototype.setSupply = function(value) {
  return jspb.Message.setWrapperField(this, 3, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.ixo.bonds.v1beta1.BondDetails} returns this
 */
proto.ixo.bonds.v1beta1.BondDetails.prototype.clearSupply = function() {
  return this.setSupply(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.ixo.bonds.v1beta1.BondDetails.prototype.hasSupply = function() {
  return jspb.Message.getField(this, 3) != null;
};


/**
 * repeated cosmos.base.v1beta1.Coin reserve = 4;
 * @return {!Array<!proto.cosmos.base.v1beta1.Coin>}
 */
proto.ixo.bonds.v1beta1.BondDetails.prototype.getReserveList = function() {
  return /** @type{!Array<!proto.cosmos.base.v1beta1.Coin>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.cosmos.base.v1beta1.Coin, 4));
};


/**
 * @param {!Array<!proto.cosmos.base.v1beta1.Coin>} value
 * @return {!proto.ixo.bonds.v1beta1.BondDetails} returns this
*/
proto.ixo.bonds.v1beta1.BondDetails.prototype.setReserveList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 4, value);
};


/**
 * @param {!proto.cosmos.base.v1beta1.Coin=} opt_value
 * @param {number=} opt_index
 * @return {!proto.cosmos.base.v1beta1.Coin}
 */
proto.ixo.bonds.v1beta1.BondDetails.prototype.addReserve = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 4, opt_value, proto.cosmos.base.v1beta1.Coin, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.ixo.bonds.v1beta1.BondDetails} returns this
 */
proto.ixo.bonds.v1beta1.BondDetails.prototype.clearReserveList = function() {
  return this.setReserveList([]);
};

