// source: shentu/shield/v1alpha1/genesis.proto
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

goog.provide('proto.shentu.shield.v1alpha1.GenesisState');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.cosmos.base.v1beta1.DecCoin');
goog.require('proto.google.protobuf.Timestamp');
goog.require('proto.shentu.shield.v1alpha1.ClaimProposalParams');
goog.require('proto.shentu.shield.v1alpha1.DistributionParams');
goog.require('proto.shentu.shield.v1alpha1.OriginalStaking');
goog.require('proto.shentu.shield.v1alpha1.Pool');
goog.require('proto.shentu.shield.v1alpha1.PoolParams');
goog.require('proto.shentu.shield.v1alpha1.ProposalIDReimbursementPair');
goog.require('proto.shentu.shield.v1alpha1.Provider');
goog.require('proto.shentu.shield.v1alpha1.PurchaseList');
goog.require('proto.shentu.shield.v1alpha1.ShieldStaking');
goog.require('proto.shentu.shield.v1alpha1.Withdraw');

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
proto.shentu.shield.v1alpha1.GenesisState = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.shentu.shield.v1alpha1.GenesisState.repeatedFields_, null);
};
goog.inherits(proto.shentu.shield.v1alpha1.GenesisState, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.shentu.shield.v1alpha1.GenesisState.displayName = 'proto.shentu.shield.v1alpha1.GenesisState';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.shentu.shield.v1alpha1.GenesisState.repeatedFields_ = [11,12,13,14,15,16,20,21,22];



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
proto.shentu.shield.v1alpha1.GenesisState.prototype.toObject = function(opt_includeInstance) {
  return proto.shentu.shield.v1alpha1.GenesisState.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.shentu.shield.v1alpha1.GenesisState} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.shentu.shield.v1alpha1.GenesisState.toObject = function(includeInstance, msg) {
  var f, obj = {
    shieldAdmin: jspb.Message.getFieldWithDefault(msg, 1, ""),
    nextPoolId: jspb.Message.getFieldWithDefault(msg, 2, 0),
    nextPurchaseId: jspb.Message.getFieldWithDefault(msg, 3, 0),
    poolParams: (f = msg.getPoolParams()) && proto.shentu.shield.v1alpha1.PoolParams.toObject(includeInstance, f),
    claimProposalParams: (f = msg.getClaimProposalParams()) && proto.shentu.shield.v1alpha1.ClaimProposalParams.toObject(includeInstance, f),
    distributionParams: (f = msg.getDistributionParams()) && proto.shentu.shield.v1alpha1.DistributionParams.toObject(includeInstance, f),
    totalCollateral: jspb.Message.getFieldWithDefault(msg, 7, ""),
    totalWithdrawing: jspb.Message.getFieldWithDefault(msg, 8, ""),
    totalShield: jspb.Message.getFieldWithDefault(msg, 9, ""),
    totalClaimed: jspb.Message.getFieldWithDefault(msg, 10, ""),
    serviceFeesList: jspb.Message.toObjectList(msg.getServiceFeesList(),
    proto.cosmos.base.v1beta1.DecCoin.toObject, includeInstance),
    remainingServiceFeesList: jspb.Message.toObjectList(msg.getRemainingServiceFeesList(),
    proto.cosmos.base.v1beta1.DecCoin.toObject, includeInstance),
    poolsList: jspb.Message.toObjectList(msg.getPoolsList(),
    proto.shentu.shield.v1alpha1.Pool.toObject, includeInstance),
    providersList: jspb.Message.toObjectList(msg.getProvidersList(),
    proto.shentu.shield.v1alpha1.Provider.toObject, includeInstance),
    purchaseListsList: jspb.Message.toObjectList(msg.getPurchaseListsList(),
    proto.shentu.shield.v1alpha1.PurchaseList.toObject, includeInstance),
    withdrawsList: jspb.Message.toObjectList(msg.getWithdrawsList(),
    proto.shentu.shield.v1alpha1.Withdraw.toObject, includeInstance),
    lastUpdateTime: (f = msg.getLastUpdateTime()) && proto.google.protobuf.Timestamp.toObject(includeInstance, f),
    shieldStakingRate: jspb.Message.getFieldWithDefault(msg, 18, ""),
    globalStakingPool: jspb.Message.getFieldWithDefault(msg, 19, ""),
    stakeForShieldsList: jspb.Message.toObjectList(msg.getStakeForShieldsList(),
    proto.shentu.shield.v1alpha1.ShieldStaking.toObject, includeInstance),
    originalStakingsList: jspb.Message.toObjectList(msg.getOriginalStakingsList(),
    proto.shentu.shield.v1alpha1.OriginalStaking.toObject, includeInstance),
    proposalidReimbursementPairsList: jspb.Message.toObjectList(msg.getProposalidReimbursementPairsList(),
    proto.shentu.shield.v1alpha1.ProposalIDReimbursementPair.toObject, includeInstance)
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
 * @return {!proto.shentu.shield.v1alpha1.GenesisState}
 */
proto.shentu.shield.v1alpha1.GenesisState.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.shentu.shield.v1alpha1.GenesisState;
  return proto.shentu.shield.v1alpha1.GenesisState.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.shentu.shield.v1alpha1.GenesisState} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.shentu.shield.v1alpha1.GenesisState}
 */
proto.shentu.shield.v1alpha1.GenesisState.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setShieldAdmin(value);
      break;
    case 2:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setNextPoolId(value);
      break;
    case 3:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setNextPurchaseId(value);
      break;
    case 4:
      var value = new proto.shentu.shield.v1alpha1.PoolParams;
      reader.readMessage(value,proto.shentu.shield.v1alpha1.PoolParams.deserializeBinaryFromReader);
      msg.setPoolParams(value);
      break;
    case 5:
      var value = new proto.shentu.shield.v1alpha1.ClaimProposalParams;
      reader.readMessage(value,proto.shentu.shield.v1alpha1.ClaimProposalParams.deserializeBinaryFromReader);
      msg.setClaimProposalParams(value);
      break;
    case 6:
      var value = new proto.shentu.shield.v1alpha1.DistributionParams;
      reader.readMessage(value,proto.shentu.shield.v1alpha1.DistributionParams.deserializeBinaryFromReader);
      msg.setDistributionParams(value);
      break;
    case 7:
      var value = /** @type {string} */ (reader.readString());
      msg.setTotalCollateral(value);
      break;
    case 8:
      var value = /** @type {string} */ (reader.readString());
      msg.setTotalWithdrawing(value);
      break;
    case 9:
      var value = /** @type {string} */ (reader.readString());
      msg.setTotalShield(value);
      break;
    case 10:
      var value = /** @type {string} */ (reader.readString());
      msg.setTotalClaimed(value);
      break;
    case 11:
      var value = new proto.cosmos.base.v1beta1.DecCoin;
      reader.readMessage(value,proto.cosmos.base.v1beta1.DecCoin.deserializeBinaryFromReader);
      msg.addServiceFees(value);
      break;
    case 12:
      var value = new proto.cosmos.base.v1beta1.DecCoin;
      reader.readMessage(value,proto.cosmos.base.v1beta1.DecCoin.deserializeBinaryFromReader);
      msg.addRemainingServiceFees(value);
      break;
    case 13:
      var value = new proto.shentu.shield.v1alpha1.Pool;
      reader.readMessage(value,proto.shentu.shield.v1alpha1.Pool.deserializeBinaryFromReader);
      msg.addPools(value);
      break;
    case 14:
      var value = new proto.shentu.shield.v1alpha1.Provider;
      reader.readMessage(value,proto.shentu.shield.v1alpha1.Provider.deserializeBinaryFromReader);
      msg.addProviders(value);
      break;
    case 15:
      var value = new proto.shentu.shield.v1alpha1.PurchaseList;
      reader.readMessage(value,proto.shentu.shield.v1alpha1.PurchaseList.deserializeBinaryFromReader);
      msg.addPurchaseLists(value);
      break;
    case 16:
      var value = new proto.shentu.shield.v1alpha1.Withdraw;
      reader.readMessage(value,proto.shentu.shield.v1alpha1.Withdraw.deserializeBinaryFromReader);
      msg.addWithdraws(value);
      break;
    case 17:
      var value = new proto.google.protobuf.Timestamp;
      reader.readMessage(value,proto.google.protobuf.Timestamp.deserializeBinaryFromReader);
      msg.setLastUpdateTime(value);
      break;
    case 18:
      var value = /** @type {string} */ (reader.readString());
      msg.setShieldStakingRate(value);
      break;
    case 19:
      var value = /** @type {string} */ (reader.readString());
      msg.setGlobalStakingPool(value);
      break;
    case 20:
      var value = new proto.shentu.shield.v1alpha1.ShieldStaking;
      reader.readMessage(value,proto.shentu.shield.v1alpha1.ShieldStaking.deserializeBinaryFromReader);
      msg.addStakeForShields(value);
      break;
    case 21:
      var value = new proto.shentu.shield.v1alpha1.OriginalStaking;
      reader.readMessage(value,proto.shentu.shield.v1alpha1.OriginalStaking.deserializeBinaryFromReader);
      msg.addOriginalStakings(value);
      break;
    case 22:
      var value = new proto.shentu.shield.v1alpha1.ProposalIDReimbursementPair;
      reader.readMessage(value,proto.shentu.shield.v1alpha1.ProposalIDReimbursementPair.deserializeBinaryFromReader);
      msg.addProposalidReimbursementPairs(value);
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
proto.shentu.shield.v1alpha1.GenesisState.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.shentu.shield.v1alpha1.GenesisState.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.shentu.shield.v1alpha1.GenesisState} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.shentu.shield.v1alpha1.GenesisState.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getShieldAdmin();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getNextPoolId();
  if (f !== 0) {
    writer.writeUint64(
      2,
      f
    );
  }
  f = message.getNextPurchaseId();
  if (f !== 0) {
    writer.writeUint64(
      3,
      f
    );
  }
  f = message.getPoolParams();
  if (f != null) {
    writer.writeMessage(
      4,
      f,
      proto.shentu.shield.v1alpha1.PoolParams.serializeBinaryToWriter
    );
  }
  f = message.getClaimProposalParams();
  if (f != null) {
    writer.writeMessage(
      5,
      f,
      proto.shentu.shield.v1alpha1.ClaimProposalParams.serializeBinaryToWriter
    );
  }
  f = message.getDistributionParams();
  if (f != null) {
    writer.writeMessage(
      6,
      f,
      proto.shentu.shield.v1alpha1.DistributionParams.serializeBinaryToWriter
    );
  }
  f = message.getTotalCollateral();
  if (f.length > 0) {
    writer.writeString(
      7,
      f
    );
  }
  f = message.getTotalWithdrawing();
  if (f.length > 0) {
    writer.writeString(
      8,
      f
    );
  }
  f = message.getTotalShield();
  if (f.length > 0) {
    writer.writeString(
      9,
      f
    );
  }
  f = message.getTotalClaimed();
  if (f.length > 0) {
    writer.writeString(
      10,
      f
    );
  }
  f = message.getServiceFeesList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      11,
      f,
      proto.cosmos.base.v1beta1.DecCoin.serializeBinaryToWriter
    );
  }
  f = message.getRemainingServiceFeesList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      12,
      f,
      proto.cosmos.base.v1beta1.DecCoin.serializeBinaryToWriter
    );
  }
  f = message.getPoolsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      13,
      f,
      proto.shentu.shield.v1alpha1.Pool.serializeBinaryToWriter
    );
  }
  f = message.getProvidersList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      14,
      f,
      proto.shentu.shield.v1alpha1.Provider.serializeBinaryToWriter
    );
  }
  f = message.getPurchaseListsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      15,
      f,
      proto.shentu.shield.v1alpha1.PurchaseList.serializeBinaryToWriter
    );
  }
  f = message.getWithdrawsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      16,
      f,
      proto.shentu.shield.v1alpha1.Withdraw.serializeBinaryToWriter
    );
  }
  f = message.getLastUpdateTime();
  if (f != null) {
    writer.writeMessage(
      17,
      f,
      proto.google.protobuf.Timestamp.serializeBinaryToWriter
    );
  }
  f = message.getShieldStakingRate();
  if (f.length > 0) {
    writer.writeString(
      18,
      f
    );
  }
  f = message.getGlobalStakingPool();
  if (f.length > 0) {
    writer.writeString(
      19,
      f
    );
  }
  f = message.getStakeForShieldsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      20,
      f,
      proto.shentu.shield.v1alpha1.ShieldStaking.serializeBinaryToWriter
    );
  }
  f = message.getOriginalStakingsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      21,
      f,
      proto.shentu.shield.v1alpha1.OriginalStaking.serializeBinaryToWriter
    );
  }
  f = message.getProposalidReimbursementPairsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      22,
      f,
      proto.shentu.shield.v1alpha1.ProposalIDReimbursementPair.serializeBinaryToWriter
    );
  }
};


/**
 * optional string shield_admin = 1;
 * @return {string}
 */
proto.shentu.shield.v1alpha1.GenesisState.prototype.getShieldAdmin = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.shentu.shield.v1alpha1.GenesisState} returns this
 */
proto.shentu.shield.v1alpha1.GenesisState.prototype.setShieldAdmin = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional uint64 next_pool_id = 2;
 * @return {number}
 */
proto.shentu.shield.v1alpha1.GenesisState.prototype.getNextPoolId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 2, 0));
};


/**
 * @param {number} value
 * @return {!proto.shentu.shield.v1alpha1.GenesisState} returns this
 */
proto.shentu.shield.v1alpha1.GenesisState.prototype.setNextPoolId = function(value) {
  return jspb.Message.setProto3IntField(this, 2, value);
};


/**
 * optional uint64 next_purchase_id = 3;
 * @return {number}
 */
proto.shentu.shield.v1alpha1.GenesisState.prototype.getNextPurchaseId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 3, 0));
};


/**
 * @param {number} value
 * @return {!proto.shentu.shield.v1alpha1.GenesisState} returns this
 */
proto.shentu.shield.v1alpha1.GenesisState.prototype.setNextPurchaseId = function(value) {
  return jspb.Message.setProto3IntField(this, 3, value);
};


/**
 * optional PoolParams pool_params = 4;
 * @return {?proto.shentu.shield.v1alpha1.PoolParams}
 */
proto.shentu.shield.v1alpha1.GenesisState.prototype.getPoolParams = function() {
  return /** @type{?proto.shentu.shield.v1alpha1.PoolParams} */ (
    jspb.Message.getWrapperField(this, proto.shentu.shield.v1alpha1.PoolParams, 4));
};


/**
 * @param {?proto.shentu.shield.v1alpha1.PoolParams|undefined} value
 * @return {!proto.shentu.shield.v1alpha1.GenesisState} returns this
*/
proto.shentu.shield.v1alpha1.GenesisState.prototype.setPoolParams = function(value) {
  return jspb.Message.setWrapperField(this, 4, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.shentu.shield.v1alpha1.GenesisState} returns this
 */
proto.shentu.shield.v1alpha1.GenesisState.prototype.clearPoolParams = function() {
  return this.setPoolParams(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.shentu.shield.v1alpha1.GenesisState.prototype.hasPoolParams = function() {
  return jspb.Message.getField(this, 4) != null;
};


/**
 * optional ClaimProposalParams claim_proposal_params = 5;
 * @return {?proto.shentu.shield.v1alpha1.ClaimProposalParams}
 */
proto.shentu.shield.v1alpha1.GenesisState.prototype.getClaimProposalParams = function() {
  return /** @type{?proto.shentu.shield.v1alpha1.ClaimProposalParams} */ (
    jspb.Message.getWrapperField(this, proto.shentu.shield.v1alpha1.ClaimProposalParams, 5));
};


/**
 * @param {?proto.shentu.shield.v1alpha1.ClaimProposalParams|undefined} value
 * @return {!proto.shentu.shield.v1alpha1.GenesisState} returns this
*/
proto.shentu.shield.v1alpha1.GenesisState.prototype.setClaimProposalParams = function(value) {
  return jspb.Message.setWrapperField(this, 5, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.shentu.shield.v1alpha1.GenesisState} returns this
 */
proto.shentu.shield.v1alpha1.GenesisState.prototype.clearClaimProposalParams = function() {
  return this.setClaimProposalParams(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.shentu.shield.v1alpha1.GenesisState.prototype.hasClaimProposalParams = function() {
  return jspb.Message.getField(this, 5) != null;
};


/**
 * optional DistributionParams distribution_params = 6;
 * @return {?proto.shentu.shield.v1alpha1.DistributionParams}
 */
proto.shentu.shield.v1alpha1.GenesisState.prototype.getDistributionParams = function() {
  return /** @type{?proto.shentu.shield.v1alpha1.DistributionParams} */ (
    jspb.Message.getWrapperField(this, proto.shentu.shield.v1alpha1.DistributionParams, 6));
};


/**
 * @param {?proto.shentu.shield.v1alpha1.DistributionParams|undefined} value
 * @return {!proto.shentu.shield.v1alpha1.GenesisState} returns this
*/
proto.shentu.shield.v1alpha1.GenesisState.prototype.setDistributionParams = function(value) {
  return jspb.Message.setWrapperField(this, 6, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.shentu.shield.v1alpha1.GenesisState} returns this
 */
proto.shentu.shield.v1alpha1.GenesisState.prototype.clearDistributionParams = function() {
  return this.setDistributionParams(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.shentu.shield.v1alpha1.GenesisState.prototype.hasDistributionParams = function() {
  return jspb.Message.getField(this, 6) != null;
};


/**
 * optional string total_collateral = 7;
 * @return {string}
 */
proto.shentu.shield.v1alpha1.GenesisState.prototype.getTotalCollateral = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 7, ""));
};


/**
 * @param {string} value
 * @return {!proto.shentu.shield.v1alpha1.GenesisState} returns this
 */
proto.shentu.shield.v1alpha1.GenesisState.prototype.setTotalCollateral = function(value) {
  return jspb.Message.setProto3StringField(this, 7, value);
};


/**
 * optional string total_withdrawing = 8;
 * @return {string}
 */
proto.shentu.shield.v1alpha1.GenesisState.prototype.getTotalWithdrawing = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 8, ""));
};


/**
 * @param {string} value
 * @return {!proto.shentu.shield.v1alpha1.GenesisState} returns this
 */
proto.shentu.shield.v1alpha1.GenesisState.prototype.setTotalWithdrawing = function(value) {
  return jspb.Message.setProto3StringField(this, 8, value);
};


/**
 * optional string total_shield = 9;
 * @return {string}
 */
proto.shentu.shield.v1alpha1.GenesisState.prototype.getTotalShield = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 9, ""));
};


/**
 * @param {string} value
 * @return {!proto.shentu.shield.v1alpha1.GenesisState} returns this
 */
proto.shentu.shield.v1alpha1.GenesisState.prototype.setTotalShield = function(value) {
  return jspb.Message.setProto3StringField(this, 9, value);
};


/**
 * optional string total_claimed = 10;
 * @return {string}
 */
proto.shentu.shield.v1alpha1.GenesisState.prototype.getTotalClaimed = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 10, ""));
};


/**
 * @param {string} value
 * @return {!proto.shentu.shield.v1alpha1.GenesisState} returns this
 */
proto.shentu.shield.v1alpha1.GenesisState.prototype.setTotalClaimed = function(value) {
  return jspb.Message.setProto3StringField(this, 10, value);
};


/**
 * repeated cosmos.base.v1beta1.DecCoin service_fees = 11;
 * @return {!Array<!proto.cosmos.base.v1beta1.DecCoin>}
 */
proto.shentu.shield.v1alpha1.GenesisState.prototype.getServiceFeesList = function() {
  return /** @type{!Array<!proto.cosmos.base.v1beta1.DecCoin>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.cosmos.base.v1beta1.DecCoin, 11));
};


/**
 * @param {!Array<!proto.cosmos.base.v1beta1.DecCoin>} value
 * @return {!proto.shentu.shield.v1alpha1.GenesisState} returns this
*/
proto.shentu.shield.v1alpha1.GenesisState.prototype.setServiceFeesList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 11, value);
};


/**
 * @param {!proto.cosmos.base.v1beta1.DecCoin=} opt_value
 * @param {number=} opt_index
 * @return {!proto.cosmos.base.v1beta1.DecCoin}
 */
proto.shentu.shield.v1alpha1.GenesisState.prototype.addServiceFees = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 11, opt_value, proto.cosmos.base.v1beta1.DecCoin, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.shentu.shield.v1alpha1.GenesisState} returns this
 */
proto.shentu.shield.v1alpha1.GenesisState.prototype.clearServiceFeesList = function() {
  return this.setServiceFeesList([]);
};


/**
 * repeated cosmos.base.v1beta1.DecCoin remaining_service_fees = 12;
 * @return {!Array<!proto.cosmos.base.v1beta1.DecCoin>}
 */
proto.shentu.shield.v1alpha1.GenesisState.prototype.getRemainingServiceFeesList = function() {
  return /** @type{!Array<!proto.cosmos.base.v1beta1.DecCoin>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.cosmos.base.v1beta1.DecCoin, 12));
};


/**
 * @param {!Array<!proto.cosmos.base.v1beta1.DecCoin>} value
 * @return {!proto.shentu.shield.v1alpha1.GenesisState} returns this
*/
proto.shentu.shield.v1alpha1.GenesisState.prototype.setRemainingServiceFeesList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 12, value);
};


/**
 * @param {!proto.cosmos.base.v1beta1.DecCoin=} opt_value
 * @param {number=} opt_index
 * @return {!proto.cosmos.base.v1beta1.DecCoin}
 */
proto.shentu.shield.v1alpha1.GenesisState.prototype.addRemainingServiceFees = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 12, opt_value, proto.cosmos.base.v1beta1.DecCoin, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.shentu.shield.v1alpha1.GenesisState} returns this
 */
proto.shentu.shield.v1alpha1.GenesisState.prototype.clearRemainingServiceFeesList = function() {
  return this.setRemainingServiceFeesList([]);
};


/**
 * repeated Pool pools = 13;
 * @return {!Array<!proto.shentu.shield.v1alpha1.Pool>}
 */
proto.shentu.shield.v1alpha1.GenesisState.prototype.getPoolsList = function() {
  return /** @type{!Array<!proto.shentu.shield.v1alpha1.Pool>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.shentu.shield.v1alpha1.Pool, 13));
};


/**
 * @param {!Array<!proto.shentu.shield.v1alpha1.Pool>} value
 * @return {!proto.shentu.shield.v1alpha1.GenesisState} returns this
*/
proto.shentu.shield.v1alpha1.GenesisState.prototype.setPoolsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 13, value);
};


/**
 * @param {!proto.shentu.shield.v1alpha1.Pool=} opt_value
 * @param {number=} opt_index
 * @return {!proto.shentu.shield.v1alpha1.Pool}
 */
proto.shentu.shield.v1alpha1.GenesisState.prototype.addPools = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 13, opt_value, proto.shentu.shield.v1alpha1.Pool, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.shentu.shield.v1alpha1.GenesisState} returns this
 */
proto.shentu.shield.v1alpha1.GenesisState.prototype.clearPoolsList = function() {
  return this.setPoolsList([]);
};


/**
 * repeated Provider providers = 14;
 * @return {!Array<!proto.shentu.shield.v1alpha1.Provider>}
 */
proto.shentu.shield.v1alpha1.GenesisState.prototype.getProvidersList = function() {
  return /** @type{!Array<!proto.shentu.shield.v1alpha1.Provider>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.shentu.shield.v1alpha1.Provider, 14));
};


/**
 * @param {!Array<!proto.shentu.shield.v1alpha1.Provider>} value
 * @return {!proto.shentu.shield.v1alpha1.GenesisState} returns this
*/
proto.shentu.shield.v1alpha1.GenesisState.prototype.setProvidersList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 14, value);
};


/**
 * @param {!proto.shentu.shield.v1alpha1.Provider=} opt_value
 * @param {number=} opt_index
 * @return {!proto.shentu.shield.v1alpha1.Provider}
 */
proto.shentu.shield.v1alpha1.GenesisState.prototype.addProviders = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 14, opt_value, proto.shentu.shield.v1alpha1.Provider, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.shentu.shield.v1alpha1.GenesisState} returns this
 */
proto.shentu.shield.v1alpha1.GenesisState.prototype.clearProvidersList = function() {
  return this.setProvidersList([]);
};


/**
 * repeated PurchaseList purchase_lists = 15;
 * @return {!Array<!proto.shentu.shield.v1alpha1.PurchaseList>}
 */
proto.shentu.shield.v1alpha1.GenesisState.prototype.getPurchaseListsList = function() {
  return /** @type{!Array<!proto.shentu.shield.v1alpha1.PurchaseList>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.shentu.shield.v1alpha1.PurchaseList, 15));
};


/**
 * @param {!Array<!proto.shentu.shield.v1alpha1.PurchaseList>} value
 * @return {!proto.shentu.shield.v1alpha1.GenesisState} returns this
*/
proto.shentu.shield.v1alpha1.GenesisState.prototype.setPurchaseListsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 15, value);
};


/**
 * @param {!proto.shentu.shield.v1alpha1.PurchaseList=} opt_value
 * @param {number=} opt_index
 * @return {!proto.shentu.shield.v1alpha1.PurchaseList}
 */
proto.shentu.shield.v1alpha1.GenesisState.prototype.addPurchaseLists = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 15, opt_value, proto.shentu.shield.v1alpha1.PurchaseList, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.shentu.shield.v1alpha1.GenesisState} returns this
 */
proto.shentu.shield.v1alpha1.GenesisState.prototype.clearPurchaseListsList = function() {
  return this.setPurchaseListsList([]);
};


/**
 * repeated Withdraw withdraws = 16;
 * @return {!Array<!proto.shentu.shield.v1alpha1.Withdraw>}
 */
proto.shentu.shield.v1alpha1.GenesisState.prototype.getWithdrawsList = function() {
  return /** @type{!Array<!proto.shentu.shield.v1alpha1.Withdraw>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.shentu.shield.v1alpha1.Withdraw, 16));
};


/**
 * @param {!Array<!proto.shentu.shield.v1alpha1.Withdraw>} value
 * @return {!proto.shentu.shield.v1alpha1.GenesisState} returns this
*/
proto.shentu.shield.v1alpha1.GenesisState.prototype.setWithdrawsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 16, value);
};


/**
 * @param {!proto.shentu.shield.v1alpha1.Withdraw=} opt_value
 * @param {number=} opt_index
 * @return {!proto.shentu.shield.v1alpha1.Withdraw}
 */
proto.shentu.shield.v1alpha1.GenesisState.prototype.addWithdraws = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 16, opt_value, proto.shentu.shield.v1alpha1.Withdraw, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.shentu.shield.v1alpha1.GenesisState} returns this
 */
proto.shentu.shield.v1alpha1.GenesisState.prototype.clearWithdrawsList = function() {
  return this.setWithdrawsList([]);
};


/**
 * optional google.protobuf.Timestamp last_update_time = 17;
 * @return {?proto.google.protobuf.Timestamp}
 */
proto.shentu.shield.v1alpha1.GenesisState.prototype.getLastUpdateTime = function() {
  return /** @type{?proto.google.protobuf.Timestamp} */ (
    jspb.Message.getWrapperField(this, proto.google.protobuf.Timestamp, 17));
};


/**
 * @param {?proto.google.protobuf.Timestamp|undefined} value
 * @return {!proto.shentu.shield.v1alpha1.GenesisState} returns this
*/
proto.shentu.shield.v1alpha1.GenesisState.prototype.setLastUpdateTime = function(value) {
  return jspb.Message.setWrapperField(this, 17, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.shentu.shield.v1alpha1.GenesisState} returns this
 */
proto.shentu.shield.v1alpha1.GenesisState.prototype.clearLastUpdateTime = function() {
  return this.setLastUpdateTime(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.shentu.shield.v1alpha1.GenesisState.prototype.hasLastUpdateTime = function() {
  return jspb.Message.getField(this, 17) != null;
};


/**
 * optional string shield_staking_rate = 18;
 * @return {string}
 */
proto.shentu.shield.v1alpha1.GenesisState.prototype.getShieldStakingRate = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 18, ""));
};


/**
 * @param {string} value
 * @return {!proto.shentu.shield.v1alpha1.GenesisState} returns this
 */
proto.shentu.shield.v1alpha1.GenesisState.prototype.setShieldStakingRate = function(value) {
  return jspb.Message.setProto3StringField(this, 18, value);
};


/**
 * optional string global_staking_pool = 19;
 * @return {string}
 */
proto.shentu.shield.v1alpha1.GenesisState.prototype.getGlobalStakingPool = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 19, ""));
};


/**
 * @param {string} value
 * @return {!proto.shentu.shield.v1alpha1.GenesisState} returns this
 */
proto.shentu.shield.v1alpha1.GenesisState.prototype.setGlobalStakingPool = function(value) {
  return jspb.Message.setProto3StringField(this, 19, value);
};


/**
 * repeated ShieldStaking stake_for_shields = 20;
 * @return {!Array<!proto.shentu.shield.v1alpha1.ShieldStaking>}
 */
proto.shentu.shield.v1alpha1.GenesisState.prototype.getStakeForShieldsList = function() {
  return /** @type{!Array<!proto.shentu.shield.v1alpha1.ShieldStaking>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.shentu.shield.v1alpha1.ShieldStaking, 20));
};


/**
 * @param {!Array<!proto.shentu.shield.v1alpha1.ShieldStaking>} value
 * @return {!proto.shentu.shield.v1alpha1.GenesisState} returns this
*/
proto.shentu.shield.v1alpha1.GenesisState.prototype.setStakeForShieldsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 20, value);
};


/**
 * @param {!proto.shentu.shield.v1alpha1.ShieldStaking=} opt_value
 * @param {number=} opt_index
 * @return {!proto.shentu.shield.v1alpha1.ShieldStaking}
 */
proto.shentu.shield.v1alpha1.GenesisState.prototype.addStakeForShields = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 20, opt_value, proto.shentu.shield.v1alpha1.ShieldStaking, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.shentu.shield.v1alpha1.GenesisState} returns this
 */
proto.shentu.shield.v1alpha1.GenesisState.prototype.clearStakeForShieldsList = function() {
  return this.setStakeForShieldsList([]);
};


/**
 * repeated OriginalStaking original_stakings = 21;
 * @return {!Array<!proto.shentu.shield.v1alpha1.OriginalStaking>}
 */
proto.shentu.shield.v1alpha1.GenesisState.prototype.getOriginalStakingsList = function() {
  return /** @type{!Array<!proto.shentu.shield.v1alpha1.OriginalStaking>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.shentu.shield.v1alpha1.OriginalStaking, 21));
};


/**
 * @param {!Array<!proto.shentu.shield.v1alpha1.OriginalStaking>} value
 * @return {!proto.shentu.shield.v1alpha1.GenesisState} returns this
*/
proto.shentu.shield.v1alpha1.GenesisState.prototype.setOriginalStakingsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 21, value);
};


/**
 * @param {!proto.shentu.shield.v1alpha1.OriginalStaking=} opt_value
 * @param {number=} opt_index
 * @return {!proto.shentu.shield.v1alpha1.OriginalStaking}
 */
proto.shentu.shield.v1alpha1.GenesisState.prototype.addOriginalStakings = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 21, opt_value, proto.shentu.shield.v1alpha1.OriginalStaking, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.shentu.shield.v1alpha1.GenesisState} returns this
 */
proto.shentu.shield.v1alpha1.GenesisState.prototype.clearOriginalStakingsList = function() {
  return this.setOriginalStakingsList([]);
};


/**
 * repeated ProposalIDReimbursementPair proposalID_reimbursement_pairs = 22;
 * @return {!Array<!proto.shentu.shield.v1alpha1.ProposalIDReimbursementPair>}
 */
proto.shentu.shield.v1alpha1.GenesisState.prototype.getProposalidReimbursementPairsList = function() {
  return /** @type{!Array<!proto.shentu.shield.v1alpha1.ProposalIDReimbursementPair>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.shentu.shield.v1alpha1.ProposalIDReimbursementPair, 22));
};


/**
 * @param {!Array<!proto.shentu.shield.v1alpha1.ProposalIDReimbursementPair>} value
 * @return {!proto.shentu.shield.v1alpha1.GenesisState} returns this
*/
proto.shentu.shield.v1alpha1.GenesisState.prototype.setProposalidReimbursementPairsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 22, value);
};


/**
 * @param {!proto.shentu.shield.v1alpha1.ProposalIDReimbursementPair=} opt_value
 * @param {number=} opt_index
 * @return {!proto.shentu.shield.v1alpha1.ProposalIDReimbursementPair}
 */
proto.shentu.shield.v1alpha1.GenesisState.prototype.addProposalidReimbursementPairs = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 22, opt_value, proto.shentu.shield.v1alpha1.ProposalIDReimbursementPair, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.shentu.shield.v1alpha1.GenesisState} returns this
 */
proto.shentu.shield.v1alpha1.GenesisState.prototype.clearProposalidReimbursementPairsList = function() {
  return this.setProposalidReimbursementPairsList([]);
};


