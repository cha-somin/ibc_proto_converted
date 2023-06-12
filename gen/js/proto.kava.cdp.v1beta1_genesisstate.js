// source: kava/cdp/v1beta1/genesis.proto
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

goog.provide('proto.kava.cdp.v1beta1.GenesisState');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.kava.cdp.v1beta1.CDP');
goog.require('proto.kava.cdp.v1beta1.Deposit');
goog.require('proto.kava.cdp.v1beta1.GenesisAccumulationTime');
goog.require('proto.kava.cdp.v1beta1.GenesisTotalPrincipal');
goog.require('proto.kava.cdp.v1beta1.Params');

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
proto.kava.cdp.v1beta1.GenesisState = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.kava.cdp.v1beta1.GenesisState.repeatedFields_, null);
};
goog.inherits(proto.kava.cdp.v1beta1.GenesisState, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.kava.cdp.v1beta1.GenesisState.displayName = 'proto.kava.cdp.v1beta1.GenesisState';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.kava.cdp.v1beta1.GenesisState.repeatedFields_ = [2,3,7,8];



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
proto.kava.cdp.v1beta1.GenesisState.prototype.toObject = function(opt_includeInstance) {
  return proto.kava.cdp.v1beta1.GenesisState.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.kava.cdp.v1beta1.GenesisState} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.kava.cdp.v1beta1.GenesisState.toObject = function(includeInstance, msg) {
  var f, obj = {
    params: (f = msg.getParams()) && proto.kava.cdp.v1beta1.Params.toObject(includeInstance, f),
    cdpsList: jspb.Message.toObjectList(msg.getCdpsList(),
    proto.kava.cdp.v1beta1.CDP.toObject, includeInstance),
    depositsList: jspb.Message.toObjectList(msg.getDepositsList(),
    proto.kava.cdp.v1beta1.Deposit.toObject, includeInstance),
    startingCdpId: jspb.Message.getFieldWithDefault(msg, 4, 0),
    debtDenom: jspb.Message.getFieldWithDefault(msg, 5, ""),
    govDenom: jspb.Message.getFieldWithDefault(msg, 6, ""),
    previousAccumulationTimesList: jspb.Message.toObjectList(msg.getPreviousAccumulationTimesList(),
    proto.kava.cdp.v1beta1.GenesisAccumulationTime.toObject, includeInstance),
    totalPrincipalsList: jspb.Message.toObjectList(msg.getTotalPrincipalsList(),
    proto.kava.cdp.v1beta1.GenesisTotalPrincipal.toObject, includeInstance)
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
 * @return {!proto.kava.cdp.v1beta1.GenesisState}
 */
proto.kava.cdp.v1beta1.GenesisState.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.kava.cdp.v1beta1.GenesisState;
  return proto.kava.cdp.v1beta1.GenesisState.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.kava.cdp.v1beta1.GenesisState} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.kava.cdp.v1beta1.GenesisState}
 */
proto.kava.cdp.v1beta1.GenesisState.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.kava.cdp.v1beta1.Params;
      reader.readMessage(value,proto.kava.cdp.v1beta1.Params.deserializeBinaryFromReader);
      msg.setParams(value);
      break;
    case 2:
      var value = new proto.kava.cdp.v1beta1.CDP;
      reader.readMessage(value,proto.kava.cdp.v1beta1.CDP.deserializeBinaryFromReader);
      msg.addCdps(value);
      break;
    case 3:
      var value = new proto.kava.cdp.v1beta1.Deposit;
      reader.readMessage(value,proto.kava.cdp.v1beta1.Deposit.deserializeBinaryFromReader);
      msg.addDeposits(value);
      break;
    case 4:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setStartingCdpId(value);
      break;
    case 5:
      var value = /** @type {string} */ (reader.readString());
      msg.setDebtDenom(value);
      break;
    case 6:
      var value = /** @type {string} */ (reader.readString());
      msg.setGovDenom(value);
      break;
    case 7:
      var value = new proto.kava.cdp.v1beta1.GenesisAccumulationTime;
      reader.readMessage(value,proto.kava.cdp.v1beta1.GenesisAccumulationTime.deserializeBinaryFromReader);
      msg.addPreviousAccumulationTimes(value);
      break;
    case 8:
      var value = new proto.kava.cdp.v1beta1.GenesisTotalPrincipal;
      reader.readMessage(value,proto.kava.cdp.v1beta1.GenesisTotalPrincipal.deserializeBinaryFromReader);
      msg.addTotalPrincipals(value);
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
proto.kava.cdp.v1beta1.GenesisState.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.kava.cdp.v1beta1.GenesisState.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.kava.cdp.v1beta1.GenesisState} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.kava.cdp.v1beta1.GenesisState.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getParams();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.kava.cdp.v1beta1.Params.serializeBinaryToWriter
    );
  }
  f = message.getCdpsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      2,
      f,
      proto.kava.cdp.v1beta1.CDP.serializeBinaryToWriter
    );
  }
  f = message.getDepositsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      3,
      f,
      proto.kava.cdp.v1beta1.Deposit.serializeBinaryToWriter
    );
  }
  f = message.getStartingCdpId();
  if (f !== 0) {
    writer.writeUint64(
      4,
      f
    );
  }
  f = message.getDebtDenom();
  if (f.length > 0) {
    writer.writeString(
      5,
      f
    );
  }
  f = message.getGovDenom();
  if (f.length > 0) {
    writer.writeString(
      6,
      f
    );
  }
  f = message.getPreviousAccumulationTimesList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      7,
      f,
      proto.kava.cdp.v1beta1.GenesisAccumulationTime.serializeBinaryToWriter
    );
  }
  f = message.getTotalPrincipalsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      8,
      f,
      proto.kava.cdp.v1beta1.GenesisTotalPrincipal.serializeBinaryToWriter
    );
  }
};


/**
 * optional Params params = 1;
 * @return {?proto.kava.cdp.v1beta1.Params}
 */
proto.kava.cdp.v1beta1.GenesisState.prototype.getParams = function() {
  return /** @type{?proto.kava.cdp.v1beta1.Params} */ (
    jspb.Message.getWrapperField(this, proto.kava.cdp.v1beta1.Params, 1));
};


/**
 * @param {?proto.kava.cdp.v1beta1.Params|undefined} value
 * @return {!proto.kava.cdp.v1beta1.GenesisState} returns this
*/
proto.kava.cdp.v1beta1.GenesisState.prototype.setParams = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.kava.cdp.v1beta1.GenesisState} returns this
 */
proto.kava.cdp.v1beta1.GenesisState.prototype.clearParams = function() {
  return this.setParams(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.kava.cdp.v1beta1.GenesisState.prototype.hasParams = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * repeated CDP cdps = 2;
 * @return {!Array<!proto.kava.cdp.v1beta1.CDP>}
 */
proto.kava.cdp.v1beta1.GenesisState.prototype.getCdpsList = function() {
  return /** @type{!Array<!proto.kava.cdp.v1beta1.CDP>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.kava.cdp.v1beta1.CDP, 2));
};


/**
 * @param {!Array<!proto.kava.cdp.v1beta1.CDP>} value
 * @return {!proto.kava.cdp.v1beta1.GenesisState} returns this
*/
proto.kava.cdp.v1beta1.GenesisState.prototype.setCdpsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 2, value);
};


/**
 * @param {!proto.kava.cdp.v1beta1.CDP=} opt_value
 * @param {number=} opt_index
 * @return {!proto.kava.cdp.v1beta1.CDP}
 */
proto.kava.cdp.v1beta1.GenesisState.prototype.addCdps = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 2, opt_value, proto.kava.cdp.v1beta1.CDP, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.kava.cdp.v1beta1.GenesisState} returns this
 */
proto.kava.cdp.v1beta1.GenesisState.prototype.clearCdpsList = function() {
  return this.setCdpsList([]);
};


/**
 * repeated Deposit deposits = 3;
 * @return {!Array<!proto.kava.cdp.v1beta1.Deposit>}
 */
proto.kava.cdp.v1beta1.GenesisState.prototype.getDepositsList = function() {
  return /** @type{!Array<!proto.kava.cdp.v1beta1.Deposit>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.kava.cdp.v1beta1.Deposit, 3));
};


/**
 * @param {!Array<!proto.kava.cdp.v1beta1.Deposit>} value
 * @return {!proto.kava.cdp.v1beta1.GenesisState} returns this
*/
proto.kava.cdp.v1beta1.GenesisState.prototype.setDepositsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 3, value);
};


/**
 * @param {!proto.kava.cdp.v1beta1.Deposit=} opt_value
 * @param {number=} opt_index
 * @return {!proto.kava.cdp.v1beta1.Deposit}
 */
proto.kava.cdp.v1beta1.GenesisState.prototype.addDeposits = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 3, opt_value, proto.kava.cdp.v1beta1.Deposit, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.kava.cdp.v1beta1.GenesisState} returns this
 */
proto.kava.cdp.v1beta1.GenesisState.prototype.clearDepositsList = function() {
  return this.setDepositsList([]);
};


/**
 * optional uint64 starting_cdp_id = 4;
 * @return {number}
 */
proto.kava.cdp.v1beta1.GenesisState.prototype.getStartingCdpId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 4, 0));
};


/**
 * @param {number} value
 * @return {!proto.kava.cdp.v1beta1.GenesisState} returns this
 */
proto.kava.cdp.v1beta1.GenesisState.prototype.setStartingCdpId = function(value) {
  return jspb.Message.setProto3IntField(this, 4, value);
};


/**
 * optional string debt_denom = 5;
 * @return {string}
 */
proto.kava.cdp.v1beta1.GenesisState.prototype.getDebtDenom = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 5, ""));
};


/**
 * @param {string} value
 * @return {!proto.kava.cdp.v1beta1.GenesisState} returns this
 */
proto.kava.cdp.v1beta1.GenesisState.prototype.setDebtDenom = function(value) {
  return jspb.Message.setProto3StringField(this, 5, value);
};


/**
 * optional string gov_denom = 6;
 * @return {string}
 */
proto.kava.cdp.v1beta1.GenesisState.prototype.getGovDenom = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 6, ""));
};


/**
 * @param {string} value
 * @return {!proto.kava.cdp.v1beta1.GenesisState} returns this
 */
proto.kava.cdp.v1beta1.GenesisState.prototype.setGovDenom = function(value) {
  return jspb.Message.setProto3StringField(this, 6, value);
};


/**
 * repeated GenesisAccumulationTime previous_accumulation_times = 7;
 * @return {!Array<!proto.kava.cdp.v1beta1.GenesisAccumulationTime>}
 */
proto.kava.cdp.v1beta1.GenesisState.prototype.getPreviousAccumulationTimesList = function() {
  return /** @type{!Array<!proto.kava.cdp.v1beta1.GenesisAccumulationTime>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.kava.cdp.v1beta1.GenesisAccumulationTime, 7));
};


/**
 * @param {!Array<!proto.kava.cdp.v1beta1.GenesisAccumulationTime>} value
 * @return {!proto.kava.cdp.v1beta1.GenesisState} returns this
*/
proto.kava.cdp.v1beta1.GenesisState.prototype.setPreviousAccumulationTimesList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 7, value);
};


/**
 * @param {!proto.kava.cdp.v1beta1.GenesisAccumulationTime=} opt_value
 * @param {number=} opt_index
 * @return {!proto.kava.cdp.v1beta1.GenesisAccumulationTime}
 */
proto.kava.cdp.v1beta1.GenesisState.prototype.addPreviousAccumulationTimes = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 7, opt_value, proto.kava.cdp.v1beta1.GenesisAccumulationTime, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.kava.cdp.v1beta1.GenesisState} returns this
 */
proto.kava.cdp.v1beta1.GenesisState.prototype.clearPreviousAccumulationTimesList = function() {
  return this.setPreviousAccumulationTimesList([]);
};


/**
 * repeated GenesisTotalPrincipal total_principals = 8;
 * @return {!Array<!proto.kava.cdp.v1beta1.GenesisTotalPrincipal>}
 */
proto.kava.cdp.v1beta1.GenesisState.prototype.getTotalPrincipalsList = function() {
  return /** @type{!Array<!proto.kava.cdp.v1beta1.GenesisTotalPrincipal>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.kava.cdp.v1beta1.GenesisTotalPrincipal, 8));
};


/**
 * @param {!Array<!proto.kava.cdp.v1beta1.GenesisTotalPrincipal>} value
 * @return {!proto.kava.cdp.v1beta1.GenesisState} returns this
*/
proto.kava.cdp.v1beta1.GenesisState.prototype.setTotalPrincipalsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 8, value);
};


/**
 * @param {!proto.kava.cdp.v1beta1.GenesisTotalPrincipal=} opt_value
 * @param {number=} opt_index
 * @return {!proto.kava.cdp.v1beta1.GenesisTotalPrincipal}
 */
proto.kava.cdp.v1beta1.GenesisState.prototype.addTotalPrincipals = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 8, opt_value, proto.kava.cdp.v1beta1.GenesisTotalPrincipal, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.kava.cdp.v1beta1.GenesisState} returns this
 */
proto.kava.cdp.v1beta1.GenesisState.prototype.clearTotalPrincipalsList = function() {
  return this.setTotalPrincipalsList([]);
};


