// source: umee/leverage/v1/genesis.proto
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

goog.provide('proto.umee.leverage.v1.GenesisState');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.cosmos.base.v1beta1.Coin');
goog.require('proto.umee.leverage.v1.AdjustedBorrow');
goog.require('proto.umee.leverage.v1.BadDebt');
goog.require('proto.umee.leverage.v1.Collateral');
goog.require('proto.umee.leverage.v1.InterestScalar');
goog.require('proto.umee.leverage.v1.Params');
goog.require('proto.umee.leverage.v1.Token');

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
proto.umee.leverage.v1.GenesisState = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.umee.leverage.v1.GenesisState.repeatedFields_, null);
};
goog.inherits(proto.umee.leverage.v1.GenesisState, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.umee.leverage.v1.GenesisState.displayName = 'proto.umee.leverage.v1.GenesisState';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.umee.leverage.v1.GenesisState.repeatedFields_ = [2,3,4,5,7,8,9];



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
proto.umee.leverage.v1.GenesisState.prototype.toObject = function(opt_includeInstance) {
  return proto.umee.leverage.v1.GenesisState.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.umee.leverage.v1.GenesisState} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.umee.leverage.v1.GenesisState.toObject = function(includeInstance, msg) {
  var f, obj = {
    params: (f = msg.getParams()) && proto.umee.leverage.v1.Params.toObject(includeInstance, f),
    registryList: jspb.Message.toObjectList(msg.getRegistryList(),
    proto.umee.leverage.v1.Token.toObject, includeInstance),
    adjustedBorrowsList: jspb.Message.toObjectList(msg.getAdjustedBorrowsList(),
    proto.umee.leverage.v1.AdjustedBorrow.toObject, includeInstance),
    collateralList: jspb.Message.toObjectList(msg.getCollateralList(),
    proto.umee.leverage.v1.Collateral.toObject, includeInstance),
    reservesList: jspb.Message.toObjectList(msg.getReservesList(),
    proto.cosmos.base.v1beta1.Coin.toObject, includeInstance),
    lastInterestTime: jspb.Message.getFieldWithDefault(msg, 6, 0),
    badDebtsList: jspb.Message.toObjectList(msg.getBadDebtsList(),
    proto.umee.leverage.v1.BadDebt.toObject, includeInstance),
    interestScalarsList: jspb.Message.toObjectList(msg.getInterestScalarsList(),
    proto.umee.leverage.v1.InterestScalar.toObject, includeInstance),
    utokenSupplyList: jspb.Message.toObjectList(msg.getUtokenSupplyList(),
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
 * @return {!proto.umee.leverage.v1.GenesisState}
 */
proto.umee.leverage.v1.GenesisState.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.umee.leverage.v1.GenesisState;
  return proto.umee.leverage.v1.GenesisState.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.umee.leverage.v1.GenesisState} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.umee.leverage.v1.GenesisState}
 */
proto.umee.leverage.v1.GenesisState.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.umee.leverage.v1.Params;
      reader.readMessage(value,proto.umee.leverage.v1.Params.deserializeBinaryFromReader);
      msg.setParams(value);
      break;
    case 2:
      var value = new proto.umee.leverage.v1.Token;
      reader.readMessage(value,proto.umee.leverage.v1.Token.deserializeBinaryFromReader);
      msg.addRegistry(value);
      break;
    case 3:
      var value = new proto.umee.leverage.v1.AdjustedBorrow;
      reader.readMessage(value,proto.umee.leverage.v1.AdjustedBorrow.deserializeBinaryFromReader);
      msg.addAdjustedBorrows(value);
      break;
    case 4:
      var value = new proto.umee.leverage.v1.Collateral;
      reader.readMessage(value,proto.umee.leverage.v1.Collateral.deserializeBinaryFromReader);
      msg.addCollateral(value);
      break;
    case 5:
      var value = new proto.cosmos.base.v1beta1.Coin;
      reader.readMessage(value,proto.cosmos.base.v1beta1.Coin.deserializeBinaryFromReader);
      msg.addReserves(value);
      break;
    case 6:
      var value = /** @type {number} */ (reader.readInt64());
      msg.setLastInterestTime(value);
      break;
    case 7:
      var value = new proto.umee.leverage.v1.BadDebt;
      reader.readMessage(value,proto.umee.leverage.v1.BadDebt.deserializeBinaryFromReader);
      msg.addBadDebts(value);
      break;
    case 8:
      var value = new proto.umee.leverage.v1.InterestScalar;
      reader.readMessage(value,proto.umee.leverage.v1.InterestScalar.deserializeBinaryFromReader);
      msg.addInterestScalars(value);
      break;
    case 9:
      var value = new proto.cosmos.base.v1beta1.Coin;
      reader.readMessage(value,proto.cosmos.base.v1beta1.Coin.deserializeBinaryFromReader);
      msg.addUtokenSupply(value);
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
proto.umee.leverage.v1.GenesisState.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.umee.leverage.v1.GenesisState.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.umee.leverage.v1.GenesisState} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.umee.leverage.v1.GenesisState.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getParams();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.umee.leverage.v1.Params.serializeBinaryToWriter
    );
  }
  f = message.getRegistryList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      2,
      f,
      proto.umee.leverage.v1.Token.serializeBinaryToWriter
    );
  }
  f = message.getAdjustedBorrowsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      3,
      f,
      proto.umee.leverage.v1.AdjustedBorrow.serializeBinaryToWriter
    );
  }
  f = message.getCollateralList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      4,
      f,
      proto.umee.leverage.v1.Collateral.serializeBinaryToWriter
    );
  }
  f = message.getReservesList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      5,
      f,
      proto.cosmos.base.v1beta1.Coin.serializeBinaryToWriter
    );
  }
  f = message.getLastInterestTime();
  if (f !== 0) {
    writer.writeInt64(
      6,
      f
    );
  }
  f = message.getBadDebtsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      7,
      f,
      proto.umee.leverage.v1.BadDebt.serializeBinaryToWriter
    );
  }
  f = message.getInterestScalarsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      8,
      f,
      proto.umee.leverage.v1.InterestScalar.serializeBinaryToWriter
    );
  }
  f = message.getUtokenSupplyList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      9,
      f,
      proto.cosmos.base.v1beta1.Coin.serializeBinaryToWriter
    );
  }
};


/**
 * optional Params params = 1;
 * @return {?proto.umee.leverage.v1.Params}
 */
proto.umee.leverage.v1.GenesisState.prototype.getParams = function() {
  return /** @type{?proto.umee.leverage.v1.Params} */ (
    jspb.Message.getWrapperField(this, proto.umee.leverage.v1.Params, 1));
};


/**
 * @param {?proto.umee.leverage.v1.Params|undefined} value
 * @return {!proto.umee.leverage.v1.GenesisState} returns this
*/
proto.umee.leverage.v1.GenesisState.prototype.setParams = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.umee.leverage.v1.GenesisState} returns this
 */
proto.umee.leverage.v1.GenesisState.prototype.clearParams = function() {
  return this.setParams(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.umee.leverage.v1.GenesisState.prototype.hasParams = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * repeated Token registry = 2;
 * @return {!Array<!proto.umee.leverage.v1.Token>}
 */
proto.umee.leverage.v1.GenesisState.prototype.getRegistryList = function() {
  return /** @type{!Array<!proto.umee.leverage.v1.Token>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.umee.leverage.v1.Token, 2));
};


/**
 * @param {!Array<!proto.umee.leverage.v1.Token>} value
 * @return {!proto.umee.leverage.v1.GenesisState} returns this
*/
proto.umee.leverage.v1.GenesisState.prototype.setRegistryList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 2, value);
};


/**
 * @param {!proto.umee.leverage.v1.Token=} opt_value
 * @param {number=} opt_index
 * @return {!proto.umee.leverage.v1.Token}
 */
proto.umee.leverage.v1.GenesisState.prototype.addRegistry = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 2, opt_value, proto.umee.leverage.v1.Token, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.umee.leverage.v1.GenesisState} returns this
 */
proto.umee.leverage.v1.GenesisState.prototype.clearRegistryList = function() {
  return this.setRegistryList([]);
};


/**
 * repeated AdjustedBorrow adjusted_borrows = 3;
 * @return {!Array<!proto.umee.leverage.v1.AdjustedBorrow>}
 */
proto.umee.leverage.v1.GenesisState.prototype.getAdjustedBorrowsList = function() {
  return /** @type{!Array<!proto.umee.leverage.v1.AdjustedBorrow>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.umee.leverage.v1.AdjustedBorrow, 3));
};


/**
 * @param {!Array<!proto.umee.leverage.v1.AdjustedBorrow>} value
 * @return {!proto.umee.leverage.v1.GenesisState} returns this
*/
proto.umee.leverage.v1.GenesisState.prototype.setAdjustedBorrowsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 3, value);
};


/**
 * @param {!proto.umee.leverage.v1.AdjustedBorrow=} opt_value
 * @param {number=} opt_index
 * @return {!proto.umee.leverage.v1.AdjustedBorrow}
 */
proto.umee.leverage.v1.GenesisState.prototype.addAdjustedBorrows = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 3, opt_value, proto.umee.leverage.v1.AdjustedBorrow, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.umee.leverage.v1.GenesisState} returns this
 */
proto.umee.leverage.v1.GenesisState.prototype.clearAdjustedBorrowsList = function() {
  return this.setAdjustedBorrowsList([]);
};


/**
 * repeated Collateral collateral = 4;
 * @return {!Array<!proto.umee.leverage.v1.Collateral>}
 */
proto.umee.leverage.v1.GenesisState.prototype.getCollateralList = function() {
  return /** @type{!Array<!proto.umee.leverage.v1.Collateral>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.umee.leverage.v1.Collateral, 4));
};


/**
 * @param {!Array<!proto.umee.leverage.v1.Collateral>} value
 * @return {!proto.umee.leverage.v1.GenesisState} returns this
*/
proto.umee.leverage.v1.GenesisState.prototype.setCollateralList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 4, value);
};


/**
 * @param {!proto.umee.leverage.v1.Collateral=} opt_value
 * @param {number=} opt_index
 * @return {!proto.umee.leverage.v1.Collateral}
 */
proto.umee.leverage.v1.GenesisState.prototype.addCollateral = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 4, opt_value, proto.umee.leverage.v1.Collateral, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.umee.leverage.v1.GenesisState} returns this
 */
proto.umee.leverage.v1.GenesisState.prototype.clearCollateralList = function() {
  return this.setCollateralList([]);
};


/**
 * repeated cosmos.base.v1beta1.Coin reserves = 5;
 * @return {!Array<!proto.cosmos.base.v1beta1.Coin>}
 */
proto.umee.leverage.v1.GenesisState.prototype.getReservesList = function() {
  return /** @type{!Array<!proto.cosmos.base.v1beta1.Coin>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.cosmos.base.v1beta1.Coin, 5));
};


/**
 * @param {!Array<!proto.cosmos.base.v1beta1.Coin>} value
 * @return {!proto.umee.leverage.v1.GenesisState} returns this
*/
proto.umee.leverage.v1.GenesisState.prototype.setReservesList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 5, value);
};


/**
 * @param {!proto.cosmos.base.v1beta1.Coin=} opt_value
 * @param {number=} opt_index
 * @return {!proto.cosmos.base.v1beta1.Coin}
 */
proto.umee.leverage.v1.GenesisState.prototype.addReserves = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 5, opt_value, proto.cosmos.base.v1beta1.Coin, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.umee.leverage.v1.GenesisState} returns this
 */
proto.umee.leverage.v1.GenesisState.prototype.clearReservesList = function() {
  return this.setReservesList([]);
};


/**
 * optional int64 last_interest_time = 6;
 * @return {number}
 */
proto.umee.leverage.v1.GenesisState.prototype.getLastInterestTime = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 6, 0));
};


/**
 * @param {number} value
 * @return {!proto.umee.leverage.v1.GenesisState} returns this
 */
proto.umee.leverage.v1.GenesisState.prototype.setLastInterestTime = function(value) {
  return jspb.Message.setProto3IntField(this, 6, value);
};


/**
 * repeated BadDebt bad_debts = 7;
 * @return {!Array<!proto.umee.leverage.v1.BadDebt>}
 */
proto.umee.leverage.v1.GenesisState.prototype.getBadDebtsList = function() {
  return /** @type{!Array<!proto.umee.leverage.v1.BadDebt>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.umee.leverage.v1.BadDebt, 7));
};


/**
 * @param {!Array<!proto.umee.leverage.v1.BadDebt>} value
 * @return {!proto.umee.leverage.v1.GenesisState} returns this
*/
proto.umee.leverage.v1.GenesisState.prototype.setBadDebtsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 7, value);
};


/**
 * @param {!proto.umee.leverage.v1.BadDebt=} opt_value
 * @param {number=} opt_index
 * @return {!proto.umee.leverage.v1.BadDebt}
 */
proto.umee.leverage.v1.GenesisState.prototype.addBadDebts = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 7, opt_value, proto.umee.leverage.v1.BadDebt, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.umee.leverage.v1.GenesisState} returns this
 */
proto.umee.leverage.v1.GenesisState.prototype.clearBadDebtsList = function() {
  return this.setBadDebtsList([]);
};


/**
 * repeated InterestScalar interest_scalars = 8;
 * @return {!Array<!proto.umee.leverage.v1.InterestScalar>}
 */
proto.umee.leverage.v1.GenesisState.prototype.getInterestScalarsList = function() {
  return /** @type{!Array<!proto.umee.leverage.v1.InterestScalar>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.umee.leverage.v1.InterestScalar, 8));
};


/**
 * @param {!Array<!proto.umee.leverage.v1.InterestScalar>} value
 * @return {!proto.umee.leverage.v1.GenesisState} returns this
*/
proto.umee.leverage.v1.GenesisState.prototype.setInterestScalarsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 8, value);
};


/**
 * @param {!proto.umee.leverage.v1.InterestScalar=} opt_value
 * @param {number=} opt_index
 * @return {!proto.umee.leverage.v1.InterestScalar}
 */
proto.umee.leverage.v1.GenesisState.prototype.addInterestScalars = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 8, opt_value, proto.umee.leverage.v1.InterestScalar, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.umee.leverage.v1.GenesisState} returns this
 */
proto.umee.leverage.v1.GenesisState.prototype.clearInterestScalarsList = function() {
  return this.setInterestScalarsList([]);
};


/**
 * repeated cosmos.base.v1beta1.Coin utoken_supply = 9;
 * @return {!Array<!proto.cosmos.base.v1beta1.Coin>}
 */
proto.umee.leverage.v1.GenesisState.prototype.getUtokenSupplyList = function() {
  return /** @type{!Array<!proto.cosmos.base.v1beta1.Coin>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.cosmos.base.v1beta1.Coin, 9));
};


/**
 * @param {!Array<!proto.cosmos.base.v1beta1.Coin>} value
 * @return {!proto.umee.leverage.v1.GenesisState} returns this
*/
proto.umee.leverage.v1.GenesisState.prototype.setUtokenSupplyList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 9, value);
};


/**
 * @param {!proto.cosmos.base.v1beta1.Coin=} opt_value
 * @param {number=} opt_index
 * @return {!proto.cosmos.base.v1beta1.Coin}
 */
proto.umee.leverage.v1.GenesisState.prototype.addUtokenSupply = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 9, opt_value, proto.cosmos.base.v1beta1.Coin, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.umee.leverage.v1.GenesisState} returns this
 */
proto.umee.leverage.v1.GenesisState.prototype.clearUtokenSupplyList = function() {
  return this.setUtokenSupplyList([]);
};

