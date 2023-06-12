// source: comdex/esm/v1beta1/genesis.proto
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

goog.provide('proto.comdex.esm.v1beta1.GenesisState');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.comdex.esm.v1beta1.CurrentDepositStats');
goog.require('proto.comdex.esm.v1beta1.DataAfterCoolOff');
goog.require('proto.comdex.esm.v1beta1.ESMStatus');
goog.require('proto.comdex.esm.v1beta1.ESMTriggerParams');
goog.require('proto.comdex.esm.v1beta1.KillSwitchParams');
goog.require('proto.comdex.esm.v1beta1.Params');
goog.require('proto.comdex.esm.v1beta1.UsersDepositMapping');

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
proto.comdex.esm.v1beta1.GenesisState = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.comdex.esm.v1beta1.GenesisState.repeatedFields_, null);
};
goog.inherits(proto.comdex.esm.v1beta1.GenesisState, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.comdex.esm.v1beta1.GenesisState.displayName = 'proto.comdex.esm.v1beta1.GenesisState';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.comdex.esm.v1beta1.GenesisState.repeatedFields_ = [1,2,3,4,5,7];



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
proto.comdex.esm.v1beta1.GenesisState.prototype.toObject = function(opt_includeInstance) {
  return proto.comdex.esm.v1beta1.GenesisState.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.comdex.esm.v1beta1.GenesisState} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.comdex.esm.v1beta1.GenesisState.toObject = function(includeInstance, msg) {
  var f, obj = {
    esmtriggerparamsList: jspb.Message.toObjectList(msg.getEsmtriggerparamsList(),
    proto.comdex.esm.v1beta1.ESMTriggerParams.toObject, includeInstance),
    currentdepositstatsList: jspb.Message.toObjectList(msg.getCurrentdepositstatsList(),
    proto.comdex.esm.v1beta1.CurrentDepositStats.toObject, includeInstance),
    esmstatusList: jspb.Message.toObjectList(msg.getEsmstatusList(),
    proto.comdex.esm.v1beta1.ESMStatus.toObject, includeInstance),
    killswitchparamsList: jspb.Message.toObjectList(msg.getKillswitchparamsList(),
    proto.comdex.esm.v1beta1.KillSwitchParams.toObject, includeInstance),
    usersdepositmappingList: jspb.Message.toObjectList(msg.getUsersdepositmappingList(),
    proto.comdex.esm.v1beta1.UsersDepositMapping.toObject, includeInstance),
    dataaftercooloffList: jspb.Message.toObjectList(msg.getDataaftercooloffList(),
    proto.comdex.esm.v1beta1.DataAfterCoolOff.toObject, includeInstance),
    params: (f = msg.getParams()) && proto.comdex.esm.v1beta1.Params.toObject(includeInstance, f)
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
 * @return {!proto.comdex.esm.v1beta1.GenesisState}
 */
proto.comdex.esm.v1beta1.GenesisState.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.comdex.esm.v1beta1.GenesisState;
  return proto.comdex.esm.v1beta1.GenesisState.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.comdex.esm.v1beta1.GenesisState} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.comdex.esm.v1beta1.GenesisState}
 */
proto.comdex.esm.v1beta1.GenesisState.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.comdex.esm.v1beta1.ESMTriggerParams;
      reader.readMessage(value,proto.comdex.esm.v1beta1.ESMTriggerParams.deserializeBinaryFromReader);
      msg.addEsmtriggerparams(value);
      break;
    case 2:
      var value = new proto.comdex.esm.v1beta1.CurrentDepositStats;
      reader.readMessage(value,proto.comdex.esm.v1beta1.CurrentDepositStats.deserializeBinaryFromReader);
      msg.addCurrentdepositstats(value);
      break;
    case 3:
      var value = new proto.comdex.esm.v1beta1.ESMStatus;
      reader.readMessage(value,proto.comdex.esm.v1beta1.ESMStatus.deserializeBinaryFromReader);
      msg.addEsmstatus(value);
      break;
    case 4:
      var value = new proto.comdex.esm.v1beta1.KillSwitchParams;
      reader.readMessage(value,proto.comdex.esm.v1beta1.KillSwitchParams.deserializeBinaryFromReader);
      msg.addKillswitchparams(value);
      break;
    case 5:
      var value = new proto.comdex.esm.v1beta1.UsersDepositMapping;
      reader.readMessage(value,proto.comdex.esm.v1beta1.UsersDepositMapping.deserializeBinaryFromReader);
      msg.addUsersdepositmapping(value);
      break;
    case 7:
      var value = new proto.comdex.esm.v1beta1.DataAfterCoolOff;
      reader.readMessage(value,proto.comdex.esm.v1beta1.DataAfterCoolOff.deserializeBinaryFromReader);
      msg.addDataaftercooloff(value);
      break;
    case 10:
      var value = new proto.comdex.esm.v1beta1.Params;
      reader.readMessage(value,proto.comdex.esm.v1beta1.Params.deserializeBinaryFromReader);
      msg.setParams(value);
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
proto.comdex.esm.v1beta1.GenesisState.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.comdex.esm.v1beta1.GenesisState.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.comdex.esm.v1beta1.GenesisState} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.comdex.esm.v1beta1.GenesisState.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getEsmtriggerparamsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      1,
      f,
      proto.comdex.esm.v1beta1.ESMTriggerParams.serializeBinaryToWriter
    );
  }
  f = message.getCurrentdepositstatsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      2,
      f,
      proto.comdex.esm.v1beta1.CurrentDepositStats.serializeBinaryToWriter
    );
  }
  f = message.getEsmstatusList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      3,
      f,
      proto.comdex.esm.v1beta1.ESMStatus.serializeBinaryToWriter
    );
  }
  f = message.getKillswitchparamsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      4,
      f,
      proto.comdex.esm.v1beta1.KillSwitchParams.serializeBinaryToWriter
    );
  }
  f = message.getUsersdepositmappingList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      5,
      f,
      proto.comdex.esm.v1beta1.UsersDepositMapping.serializeBinaryToWriter
    );
  }
  f = message.getDataaftercooloffList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      7,
      f,
      proto.comdex.esm.v1beta1.DataAfterCoolOff.serializeBinaryToWriter
    );
  }
  f = message.getParams();
  if (f != null) {
    writer.writeMessage(
      10,
      f,
      proto.comdex.esm.v1beta1.Params.serializeBinaryToWriter
    );
  }
};


/**
 * repeated ESMTriggerParams eSMTriggerParams = 1;
 * @return {!Array<!proto.comdex.esm.v1beta1.ESMTriggerParams>}
 */
proto.comdex.esm.v1beta1.GenesisState.prototype.getEsmtriggerparamsList = function() {
  return /** @type{!Array<!proto.comdex.esm.v1beta1.ESMTriggerParams>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.comdex.esm.v1beta1.ESMTriggerParams, 1));
};


/**
 * @param {!Array<!proto.comdex.esm.v1beta1.ESMTriggerParams>} value
 * @return {!proto.comdex.esm.v1beta1.GenesisState} returns this
*/
proto.comdex.esm.v1beta1.GenesisState.prototype.setEsmtriggerparamsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 1, value);
};


/**
 * @param {!proto.comdex.esm.v1beta1.ESMTriggerParams=} opt_value
 * @param {number=} opt_index
 * @return {!proto.comdex.esm.v1beta1.ESMTriggerParams}
 */
proto.comdex.esm.v1beta1.GenesisState.prototype.addEsmtriggerparams = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 1, opt_value, proto.comdex.esm.v1beta1.ESMTriggerParams, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.comdex.esm.v1beta1.GenesisState} returns this
 */
proto.comdex.esm.v1beta1.GenesisState.prototype.clearEsmtriggerparamsList = function() {
  return this.setEsmtriggerparamsList([]);
};


/**
 * repeated CurrentDepositStats currentDepositStats = 2;
 * @return {!Array<!proto.comdex.esm.v1beta1.CurrentDepositStats>}
 */
proto.comdex.esm.v1beta1.GenesisState.prototype.getCurrentdepositstatsList = function() {
  return /** @type{!Array<!proto.comdex.esm.v1beta1.CurrentDepositStats>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.comdex.esm.v1beta1.CurrentDepositStats, 2));
};


/**
 * @param {!Array<!proto.comdex.esm.v1beta1.CurrentDepositStats>} value
 * @return {!proto.comdex.esm.v1beta1.GenesisState} returns this
*/
proto.comdex.esm.v1beta1.GenesisState.prototype.setCurrentdepositstatsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 2, value);
};


/**
 * @param {!proto.comdex.esm.v1beta1.CurrentDepositStats=} opt_value
 * @param {number=} opt_index
 * @return {!proto.comdex.esm.v1beta1.CurrentDepositStats}
 */
proto.comdex.esm.v1beta1.GenesisState.prototype.addCurrentdepositstats = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 2, opt_value, proto.comdex.esm.v1beta1.CurrentDepositStats, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.comdex.esm.v1beta1.GenesisState} returns this
 */
proto.comdex.esm.v1beta1.GenesisState.prototype.clearCurrentdepositstatsList = function() {
  return this.setCurrentdepositstatsList([]);
};


/**
 * repeated ESMStatus eSMStatus = 3;
 * @return {!Array<!proto.comdex.esm.v1beta1.ESMStatus>}
 */
proto.comdex.esm.v1beta1.GenesisState.prototype.getEsmstatusList = function() {
  return /** @type{!Array<!proto.comdex.esm.v1beta1.ESMStatus>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.comdex.esm.v1beta1.ESMStatus, 3));
};


/**
 * @param {!Array<!proto.comdex.esm.v1beta1.ESMStatus>} value
 * @return {!proto.comdex.esm.v1beta1.GenesisState} returns this
*/
proto.comdex.esm.v1beta1.GenesisState.prototype.setEsmstatusList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 3, value);
};


/**
 * @param {!proto.comdex.esm.v1beta1.ESMStatus=} opt_value
 * @param {number=} opt_index
 * @return {!proto.comdex.esm.v1beta1.ESMStatus}
 */
proto.comdex.esm.v1beta1.GenesisState.prototype.addEsmstatus = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 3, opt_value, proto.comdex.esm.v1beta1.ESMStatus, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.comdex.esm.v1beta1.GenesisState} returns this
 */
proto.comdex.esm.v1beta1.GenesisState.prototype.clearEsmstatusList = function() {
  return this.setEsmstatusList([]);
};


/**
 * repeated KillSwitchParams killSwitchParams = 4;
 * @return {!Array<!proto.comdex.esm.v1beta1.KillSwitchParams>}
 */
proto.comdex.esm.v1beta1.GenesisState.prototype.getKillswitchparamsList = function() {
  return /** @type{!Array<!proto.comdex.esm.v1beta1.KillSwitchParams>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.comdex.esm.v1beta1.KillSwitchParams, 4));
};


/**
 * @param {!Array<!proto.comdex.esm.v1beta1.KillSwitchParams>} value
 * @return {!proto.comdex.esm.v1beta1.GenesisState} returns this
*/
proto.comdex.esm.v1beta1.GenesisState.prototype.setKillswitchparamsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 4, value);
};


/**
 * @param {!proto.comdex.esm.v1beta1.KillSwitchParams=} opt_value
 * @param {number=} opt_index
 * @return {!proto.comdex.esm.v1beta1.KillSwitchParams}
 */
proto.comdex.esm.v1beta1.GenesisState.prototype.addKillswitchparams = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 4, opt_value, proto.comdex.esm.v1beta1.KillSwitchParams, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.comdex.esm.v1beta1.GenesisState} returns this
 */
proto.comdex.esm.v1beta1.GenesisState.prototype.clearKillswitchparamsList = function() {
  return this.setKillswitchparamsList([]);
};


/**
 * repeated UsersDepositMapping usersDepositMapping = 5;
 * @return {!Array<!proto.comdex.esm.v1beta1.UsersDepositMapping>}
 */
proto.comdex.esm.v1beta1.GenesisState.prototype.getUsersdepositmappingList = function() {
  return /** @type{!Array<!proto.comdex.esm.v1beta1.UsersDepositMapping>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.comdex.esm.v1beta1.UsersDepositMapping, 5));
};


/**
 * @param {!Array<!proto.comdex.esm.v1beta1.UsersDepositMapping>} value
 * @return {!proto.comdex.esm.v1beta1.GenesisState} returns this
*/
proto.comdex.esm.v1beta1.GenesisState.prototype.setUsersdepositmappingList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 5, value);
};


/**
 * @param {!proto.comdex.esm.v1beta1.UsersDepositMapping=} opt_value
 * @param {number=} opt_index
 * @return {!proto.comdex.esm.v1beta1.UsersDepositMapping}
 */
proto.comdex.esm.v1beta1.GenesisState.prototype.addUsersdepositmapping = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 5, opt_value, proto.comdex.esm.v1beta1.UsersDepositMapping, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.comdex.esm.v1beta1.GenesisState} returns this
 */
proto.comdex.esm.v1beta1.GenesisState.prototype.clearUsersdepositmappingList = function() {
  return this.setUsersdepositmappingList([]);
};


/**
 * repeated DataAfterCoolOff dataAfterCoolOff = 7;
 * @return {!Array<!proto.comdex.esm.v1beta1.DataAfterCoolOff>}
 */
proto.comdex.esm.v1beta1.GenesisState.prototype.getDataaftercooloffList = function() {
  return /** @type{!Array<!proto.comdex.esm.v1beta1.DataAfterCoolOff>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.comdex.esm.v1beta1.DataAfterCoolOff, 7));
};


/**
 * @param {!Array<!proto.comdex.esm.v1beta1.DataAfterCoolOff>} value
 * @return {!proto.comdex.esm.v1beta1.GenesisState} returns this
*/
proto.comdex.esm.v1beta1.GenesisState.prototype.setDataaftercooloffList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 7, value);
};


/**
 * @param {!proto.comdex.esm.v1beta1.DataAfterCoolOff=} opt_value
 * @param {number=} opt_index
 * @return {!proto.comdex.esm.v1beta1.DataAfterCoolOff}
 */
proto.comdex.esm.v1beta1.GenesisState.prototype.addDataaftercooloff = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 7, opt_value, proto.comdex.esm.v1beta1.DataAfterCoolOff, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.comdex.esm.v1beta1.GenesisState} returns this
 */
proto.comdex.esm.v1beta1.GenesisState.prototype.clearDataaftercooloffList = function() {
  return this.setDataaftercooloffList([]);
};


/**
 * optional Params params = 10;
 * @return {?proto.comdex.esm.v1beta1.Params}
 */
proto.comdex.esm.v1beta1.GenesisState.prototype.getParams = function() {
  return /** @type{?proto.comdex.esm.v1beta1.Params} */ (
    jspb.Message.getWrapperField(this, proto.comdex.esm.v1beta1.Params, 10));
};


/**
 * @param {?proto.comdex.esm.v1beta1.Params|undefined} value
 * @return {!proto.comdex.esm.v1beta1.GenesisState} returns this
*/
proto.comdex.esm.v1beta1.GenesisState.prototype.setParams = function(value) {
  return jspb.Message.setWrapperField(this, 10, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.comdex.esm.v1beta1.GenesisState} returns this
 */
proto.comdex.esm.v1beta1.GenesisState.prototype.clearParams = function() {
  return this.setParams(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.comdex.esm.v1beta1.GenesisState.prototype.hasParams = function() {
  return jspb.Message.getField(this, 10) != null;
};


