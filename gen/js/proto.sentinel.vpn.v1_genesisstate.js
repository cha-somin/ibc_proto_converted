// source: sentinel/vpn/v1/genesis.proto
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

goog.provide('proto.sentinel.vpn.v1.GenesisState');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.sentinel.deposit.v1.Deposit');
goog.require('proto.sentinel.node.v2.GenesisState');
goog.require('proto.sentinel.plan.v2.GenesisPlan');
goog.require('proto.sentinel.provider.v2.GenesisState');
goog.require('proto.sentinel.session.v2.GenesisState');
goog.require('proto.sentinel.subscription.v2.GenesisState');

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
proto.sentinel.vpn.v1.GenesisState = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.sentinel.vpn.v1.GenesisState.repeatedFields_, null);
};
goog.inherits(proto.sentinel.vpn.v1.GenesisState, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.sentinel.vpn.v1.GenesisState.displayName = 'proto.sentinel.vpn.v1.GenesisState';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.sentinel.vpn.v1.GenesisState.repeatedFields_ = [1,3];



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
proto.sentinel.vpn.v1.GenesisState.prototype.toObject = function(opt_includeInstance) {
  return proto.sentinel.vpn.v1.GenesisState.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.sentinel.vpn.v1.GenesisState} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.sentinel.vpn.v1.GenesisState.toObject = function(includeInstance, msg) {
  var f, obj = {
    depositsList: jspb.Message.toObjectList(msg.getDepositsList(),
    proto.sentinel.deposit.v1.Deposit.toObject, includeInstance),
    nodes: (f = msg.getNodes()) && proto.sentinel.node.v2.GenesisState.toObject(includeInstance, f),
    plansList: jspb.Message.toObjectList(msg.getPlansList(),
    proto.sentinel.plan.v2.GenesisPlan.toObject, includeInstance),
    providers: (f = msg.getProviders()) && proto.sentinel.provider.v2.GenesisState.toObject(includeInstance, f),
    sessions: (f = msg.getSessions()) && proto.sentinel.session.v2.GenesisState.toObject(includeInstance, f),
    subscriptions: (f = msg.getSubscriptions()) && proto.sentinel.subscription.v2.GenesisState.toObject(includeInstance, f)
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
 * @return {!proto.sentinel.vpn.v1.GenesisState}
 */
proto.sentinel.vpn.v1.GenesisState.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.sentinel.vpn.v1.GenesisState;
  return proto.sentinel.vpn.v1.GenesisState.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.sentinel.vpn.v1.GenesisState} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.sentinel.vpn.v1.GenesisState}
 */
proto.sentinel.vpn.v1.GenesisState.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.sentinel.deposit.v1.Deposit;
      reader.readMessage(value,proto.sentinel.deposit.v1.Deposit.deserializeBinaryFromReader);
      msg.addDeposits(value);
      break;
    case 2:
      var value = new proto.sentinel.node.v2.GenesisState;
      reader.readMessage(value,proto.sentinel.node.v2.GenesisState.deserializeBinaryFromReader);
      msg.setNodes(value);
      break;
    case 3:
      var value = new proto.sentinel.plan.v2.GenesisPlan;
      reader.readMessage(value,proto.sentinel.plan.v2.GenesisPlan.deserializeBinaryFromReader);
      msg.addPlans(value);
      break;
    case 4:
      var value = new proto.sentinel.provider.v2.GenesisState;
      reader.readMessage(value,proto.sentinel.provider.v2.GenesisState.deserializeBinaryFromReader);
      msg.setProviders(value);
      break;
    case 5:
      var value = new proto.sentinel.session.v2.GenesisState;
      reader.readMessage(value,proto.sentinel.session.v2.GenesisState.deserializeBinaryFromReader);
      msg.setSessions(value);
      break;
    case 6:
      var value = new proto.sentinel.subscription.v2.GenesisState;
      reader.readMessage(value,proto.sentinel.subscription.v2.GenesisState.deserializeBinaryFromReader);
      msg.setSubscriptions(value);
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
proto.sentinel.vpn.v1.GenesisState.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.sentinel.vpn.v1.GenesisState.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.sentinel.vpn.v1.GenesisState} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.sentinel.vpn.v1.GenesisState.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getDepositsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      1,
      f,
      proto.sentinel.deposit.v1.Deposit.serializeBinaryToWriter
    );
  }
  f = message.getNodes();
  if (f != null) {
    writer.writeMessage(
      2,
      f,
      proto.sentinel.node.v2.GenesisState.serializeBinaryToWriter
    );
  }
  f = message.getPlansList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      3,
      f,
      proto.sentinel.plan.v2.GenesisPlan.serializeBinaryToWriter
    );
  }
  f = message.getProviders();
  if (f != null) {
    writer.writeMessage(
      4,
      f,
      proto.sentinel.provider.v2.GenesisState.serializeBinaryToWriter
    );
  }
  f = message.getSessions();
  if (f != null) {
    writer.writeMessage(
      5,
      f,
      proto.sentinel.session.v2.GenesisState.serializeBinaryToWriter
    );
  }
  f = message.getSubscriptions();
  if (f != null) {
    writer.writeMessage(
      6,
      f,
      proto.sentinel.subscription.v2.GenesisState.serializeBinaryToWriter
    );
  }
};


/**
 * repeated sentinel.deposit.v1.Deposit deposits = 1;
 * @return {!Array<!proto.sentinel.deposit.v1.Deposit>}
 */
proto.sentinel.vpn.v1.GenesisState.prototype.getDepositsList = function() {
  return /** @type{!Array<!proto.sentinel.deposit.v1.Deposit>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.sentinel.deposit.v1.Deposit, 1));
};


/**
 * @param {!Array<!proto.sentinel.deposit.v1.Deposit>} value
 * @return {!proto.sentinel.vpn.v1.GenesisState} returns this
*/
proto.sentinel.vpn.v1.GenesisState.prototype.setDepositsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 1, value);
};


/**
 * @param {!proto.sentinel.deposit.v1.Deposit=} opt_value
 * @param {number=} opt_index
 * @return {!proto.sentinel.deposit.v1.Deposit}
 */
proto.sentinel.vpn.v1.GenesisState.prototype.addDeposits = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 1, opt_value, proto.sentinel.deposit.v1.Deposit, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.sentinel.vpn.v1.GenesisState} returns this
 */
proto.sentinel.vpn.v1.GenesisState.prototype.clearDepositsList = function() {
  return this.setDepositsList([]);
};


/**
 * optional sentinel.node.v2.GenesisState nodes = 2;
 * @return {?proto.sentinel.node.v2.GenesisState}
 */
proto.sentinel.vpn.v1.GenesisState.prototype.getNodes = function() {
  return /** @type{?proto.sentinel.node.v2.GenesisState} */ (
    jspb.Message.getWrapperField(this, proto.sentinel.node.v2.GenesisState, 2));
};


/**
 * @param {?proto.sentinel.node.v2.GenesisState|undefined} value
 * @return {!proto.sentinel.vpn.v1.GenesisState} returns this
*/
proto.sentinel.vpn.v1.GenesisState.prototype.setNodes = function(value) {
  return jspb.Message.setWrapperField(this, 2, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.sentinel.vpn.v1.GenesisState} returns this
 */
proto.sentinel.vpn.v1.GenesisState.prototype.clearNodes = function() {
  return this.setNodes(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.sentinel.vpn.v1.GenesisState.prototype.hasNodes = function() {
  return jspb.Message.getField(this, 2) != null;
};


/**
 * repeated sentinel.plan.v2.GenesisPlan plans = 3;
 * @return {!Array<!proto.sentinel.plan.v2.GenesisPlan>}
 */
proto.sentinel.vpn.v1.GenesisState.prototype.getPlansList = function() {
  return /** @type{!Array<!proto.sentinel.plan.v2.GenesisPlan>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.sentinel.plan.v2.GenesisPlan, 3));
};


/**
 * @param {!Array<!proto.sentinel.plan.v2.GenesisPlan>} value
 * @return {!proto.sentinel.vpn.v1.GenesisState} returns this
*/
proto.sentinel.vpn.v1.GenesisState.prototype.setPlansList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 3, value);
};


/**
 * @param {!proto.sentinel.plan.v2.GenesisPlan=} opt_value
 * @param {number=} opt_index
 * @return {!proto.sentinel.plan.v2.GenesisPlan}
 */
proto.sentinel.vpn.v1.GenesisState.prototype.addPlans = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 3, opt_value, proto.sentinel.plan.v2.GenesisPlan, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.sentinel.vpn.v1.GenesisState} returns this
 */
proto.sentinel.vpn.v1.GenesisState.prototype.clearPlansList = function() {
  return this.setPlansList([]);
};


/**
 * optional sentinel.provider.v2.GenesisState providers = 4;
 * @return {?proto.sentinel.provider.v2.GenesisState}
 */
proto.sentinel.vpn.v1.GenesisState.prototype.getProviders = function() {
  return /** @type{?proto.sentinel.provider.v2.GenesisState} */ (
    jspb.Message.getWrapperField(this, proto.sentinel.provider.v2.GenesisState, 4));
};


/**
 * @param {?proto.sentinel.provider.v2.GenesisState|undefined} value
 * @return {!proto.sentinel.vpn.v1.GenesisState} returns this
*/
proto.sentinel.vpn.v1.GenesisState.prototype.setProviders = function(value) {
  return jspb.Message.setWrapperField(this, 4, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.sentinel.vpn.v1.GenesisState} returns this
 */
proto.sentinel.vpn.v1.GenesisState.prototype.clearProviders = function() {
  return this.setProviders(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.sentinel.vpn.v1.GenesisState.prototype.hasProviders = function() {
  return jspb.Message.getField(this, 4) != null;
};


/**
 * optional sentinel.session.v2.GenesisState sessions = 5;
 * @return {?proto.sentinel.session.v2.GenesisState}
 */
proto.sentinel.vpn.v1.GenesisState.prototype.getSessions = function() {
  return /** @type{?proto.sentinel.session.v2.GenesisState} */ (
    jspb.Message.getWrapperField(this, proto.sentinel.session.v2.GenesisState, 5));
};


/**
 * @param {?proto.sentinel.session.v2.GenesisState|undefined} value
 * @return {!proto.sentinel.vpn.v1.GenesisState} returns this
*/
proto.sentinel.vpn.v1.GenesisState.prototype.setSessions = function(value) {
  return jspb.Message.setWrapperField(this, 5, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.sentinel.vpn.v1.GenesisState} returns this
 */
proto.sentinel.vpn.v1.GenesisState.prototype.clearSessions = function() {
  return this.setSessions(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.sentinel.vpn.v1.GenesisState.prototype.hasSessions = function() {
  return jspb.Message.getField(this, 5) != null;
};


/**
 * optional sentinel.subscription.v2.GenesisState subscriptions = 6;
 * @return {?proto.sentinel.subscription.v2.GenesisState}
 */
proto.sentinel.vpn.v1.GenesisState.prototype.getSubscriptions = function() {
  return /** @type{?proto.sentinel.subscription.v2.GenesisState} */ (
    jspb.Message.getWrapperField(this, proto.sentinel.subscription.v2.GenesisState, 6));
};


/**
 * @param {?proto.sentinel.subscription.v2.GenesisState|undefined} value
 * @return {!proto.sentinel.vpn.v1.GenesisState} returns this
*/
proto.sentinel.vpn.v1.GenesisState.prototype.setSubscriptions = function(value) {
  return jspb.Message.setWrapperField(this, 6, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.sentinel.vpn.v1.GenesisState} returns this
 */
proto.sentinel.vpn.v1.GenesisState.prototype.clearSubscriptions = function() {
  return this.setSubscriptions(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.sentinel.vpn.v1.GenesisState.prototype.hasSubscriptions = function() {
  return jspb.Message.getField(this, 6) != null;
};


