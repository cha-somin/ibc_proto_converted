// source: axelar/permission/v1beta1/genesis.proto
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

goog.provide('proto.axelar.permission.v1beta1.GenesisState');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.axelar.permission.v1beta1.GovAccount');
goog.require('proto.axelar.permission.v1beta1.Params');
goog.require('proto.cosmos.crypto.multisig.LegacyAminoPubKey');

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
proto.axelar.permission.v1beta1.GenesisState = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.axelar.permission.v1beta1.GenesisState.repeatedFields_, null);
};
goog.inherits(proto.axelar.permission.v1beta1.GenesisState, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.axelar.permission.v1beta1.GenesisState.displayName = 'proto.axelar.permission.v1beta1.GenesisState';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.axelar.permission.v1beta1.GenesisState.repeatedFields_ = [3];



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
proto.axelar.permission.v1beta1.GenesisState.prototype.toObject = function(opt_includeInstance) {
  return proto.axelar.permission.v1beta1.GenesisState.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.axelar.permission.v1beta1.GenesisState} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.axelar.permission.v1beta1.GenesisState.toObject = function(includeInstance, msg) {
  var f, obj = {
    params: (f = msg.getParams()) && proto.axelar.permission.v1beta1.Params.toObject(includeInstance, f),
    governanceKey: (f = msg.getGovernanceKey()) && proto.cosmos.crypto.multisig.LegacyAminoPubKey.toObject(includeInstance, f),
    govAccountsList: jspb.Message.toObjectList(msg.getGovAccountsList(),
    proto.axelar.permission.v1beta1.GovAccount.toObject, includeInstance)
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
 * @return {!proto.axelar.permission.v1beta1.GenesisState}
 */
proto.axelar.permission.v1beta1.GenesisState.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.axelar.permission.v1beta1.GenesisState;
  return proto.axelar.permission.v1beta1.GenesisState.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.axelar.permission.v1beta1.GenesisState} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.axelar.permission.v1beta1.GenesisState}
 */
proto.axelar.permission.v1beta1.GenesisState.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.axelar.permission.v1beta1.Params;
      reader.readMessage(value,proto.axelar.permission.v1beta1.Params.deserializeBinaryFromReader);
      msg.setParams(value);
      break;
    case 2:
      var value = new proto.cosmos.crypto.multisig.LegacyAminoPubKey;
      reader.readMessage(value,proto.cosmos.crypto.multisig.LegacyAminoPubKey.deserializeBinaryFromReader);
      msg.setGovernanceKey(value);
      break;
    case 3:
      var value = new proto.axelar.permission.v1beta1.GovAccount;
      reader.readMessage(value,proto.axelar.permission.v1beta1.GovAccount.deserializeBinaryFromReader);
      msg.addGovAccounts(value);
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
proto.axelar.permission.v1beta1.GenesisState.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.axelar.permission.v1beta1.GenesisState.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.axelar.permission.v1beta1.GenesisState} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.axelar.permission.v1beta1.GenesisState.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getParams();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.axelar.permission.v1beta1.Params.serializeBinaryToWriter
    );
  }
  f = message.getGovernanceKey();
  if (f != null) {
    writer.writeMessage(
      2,
      f,
      proto.cosmos.crypto.multisig.LegacyAminoPubKey.serializeBinaryToWriter
    );
  }
  f = message.getGovAccountsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      3,
      f,
      proto.axelar.permission.v1beta1.GovAccount.serializeBinaryToWriter
    );
  }
};


/**
 * optional Params params = 1;
 * @return {?proto.axelar.permission.v1beta1.Params}
 */
proto.axelar.permission.v1beta1.GenesisState.prototype.getParams = function() {
  return /** @type{?proto.axelar.permission.v1beta1.Params} */ (
    jspb.Message.getWrapperField(this, proto.axelar.permission.v1beta1.Params, 1));
};


/**
 * @param {?proto.axelar.permission.v1beta1.Params|undefined} value
 * @return {!proto.axelar.permission.v1beta1.GenesisState} returns this
*/
proto.axelar.permission.v1beta1.GenesisState.prototype.setParams = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.axelar.permission.v1beta1.GenesisState} returns this
 */
proto.axelar.permission.v1beta1.GenesisState.prototype.clearParams = function() {
  return this.setParams(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.axelar.permission.v1beta1.GenesisState.prototype.hasParams = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * optional cosmos.crypto.multisig.LegacyAminoPubKey governance_key = 2;
 * @return {?proto.cosmos.crypto.multisig.LegacyAminoPubKey}
 */
proto.axelar.permission.v1beta1.GenesisState.prototype.getGovernanceKey = function() {
  return /** @type{?proto.cosmos.crypto.multisig.LegacyAminoPubKey} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.crypto.multisig.LegacyAminoPubKey, 2));
};


/**
 * @param {?proto.cosmos.crypto.multisig.LegacyAminoPubKey|undefined} value
 * @return {!proto.axelar.permission.v1beta1.GenesisState} returns this
*/
proto.axelar.permission.v1beta1.GenesisState.prototype.setGovernanceKey = function(value) {
  return jspb.Message.setWrapperField(this, 2, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.axelar.permission.v1beta1.GenesisState} returns this
 */
proto.axelar.permission.v1beta1.GenesisState.prototype.clearGovernanceKey = function() {
  return this.setGovernanceKey(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.axelar.permission.v1beta1.GenesisState.prototype.hasGovernanceKey = function() {
  return jspb.Message.getField(this, 2) != null;
};


/**
 * repeated GovAccount gov_accounts = 3;
 * @return {!Array<!proto.axelar.permission.v1beta1.GovAccount>}
 */
proto.axelar.permission.v1beta1.GenesisState.prototype.getGovAccountsList = function() {
  return /** @type{!Array<!proto.axelar.permission.v1beta1.GovAccount>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.axelar.permission.v1beta1.GovAccount, 3));
};


/**
 * @param {!Array<!proto.axelar.permission.v1beta1.GovAccount>} value
 * @return {!proto.axelar.permission.v1beta1.GenesisState} returns this
*/
proto.axelar.permission.v1beta1.GenesisState.prototype.setGovAccountsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 3, value);
};


/**
 * @param {!proto.axelar.permission.v1beta1.GovAccount=} opt_value
 * @param {number=} opt_index
 * @return {!proto.axelar.permission.v1beta1.GovAccount}
 */
proto.axelar.permission.v1beta1.GenesisState.prototype.addGovAccounts = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 3, opt_value, proto.axelar.permission.v1beta1.GovAccount, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.axelar.permission.v1beta1.GenesisState} returns this
 */
proto.axelar.permission.v1beta1.GenesisState.prototype.clearGovAccountsList = function() {
  return this.setGovAccountsList([]);
};


