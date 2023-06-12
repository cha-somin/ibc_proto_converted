// source: confio/poe/v1beta1/genesis.proto
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

goog.provide('proto.confio.poe.v1beta1.SeedContracts');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.confio.poe.v1beta1.ArbiterPoolContractConfig');
goog.require('proto.confio.poe.v1beta1.CommunityPoolContractConfig');
goog.require('proto.confio.poe.v1beta1.EngagementContractConfig');
goog.require('proto.confio.poe.v1beta1.MixerContractConfig');
goog.require('proto.confio.poe.v1beta1.OversightCommitteeContractConfig');
goog.require('proto.confio.poe.v1beta1.StakeContractConfig');
goog.require('proto.confio.poe.v1beta1.TG4Member');
goog.require('proto.confio.poe.v1beta1.ValidatorVotingContractConfig');
goog.require('proto.confio.poe.v1beta1.ValsetContractConfig');

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
proto.confio.poe.v1beta1.SeedContracts = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.confio.poe.v1beta1.SeedContracts.repeatedFields_, null);
};
goog.inherits(proto.confio.poe.v1beta1.SeedContracts, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.confio.poe.v1beta1.SeedContracts.displayName = 'proto.confio.poe.v1beta1.SeedContracts';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.confio.poe.v1beta1.SeedContracts.repeatedFields_ = [1,3,11,12];



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
proto.confio.poe.v1beta1.SeedContracts.prototype.toObject = function(opt_includeInstance) {
  return proto.confio.poe.v1beta1.SeedContracts.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.confio.poe.v1beta1.SeedContracts} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.confio.poe.v1beta1.SeedContracts.toObject = function(includeInstance, msg) {
  var f, obj = {
    genTxsList: msg.getGenTxsList_asB64(),
    bootstrapAccountAddress: jspb.Message.getFieldWithDefault(msg, 2, ""),
    engagementList: jspb.Message.toObjectList(msg.getEngagementList(),
    proto.confio.poe.v1beta1.TG4Member.toObject, includeInstance),
    stakeContractConfig: (f = msg.getStakeContractConfig()) && proto.confio.poe.v1beta1.StakeContractConfig.toObject(includeInstance, f),
    valsetContractConfig: (f = msg.getValsetContractConfig()) && proto.confio.poe.v1beta1.ValsetContractConfig.toObject(includeInstance, f),
    engagementContractConfig: (f = msg.getEngagementContractConfig()) && proto.confio.poe.v1beta1.EngagementContractConfig.toObject(includeInstance, f),
    bondDenom: jspb.Message.getFieldWithDefault(msg, 7, ""),
    oversightCommitteeContractConfig: (f = msg.getOversightCommitteeContractConfig()) && proto.confio.poe.v1beta1.OversightCommitteeContractConfig.toObject(includeInstance, f),
    communityPoolContractConfig: (f = msg.getCommunityPoolContractConfig()) && proto.confio.poe.v1beta1.CommunityPoolContractConfig.toObject(includeInstance, f),
    validatorVotingContractConfig: (f = msg.getValidatorVotingContractConfig()) && proto.confio.poe.v1beta1.ValidatorVotingContractConfig.toObject(includeInstance, f),
    oversightCommunityMembersList: (f = jspb.Message.getRepeatedField(msg, 11)) == null ? undefined : f,
    arbiterPoolMembersList: (f = jspb.Message.getRepeatedField(msg, 12)) == null ? undefined : f,
    arbiterPoolContractConfig: (f = msg.getArbiterPoolContractConfig()) && proto.confio.poe.v1beta1.ArbiterPoolContractConfig.toObject(includeInstance, f),
    mixerContractConfig: (f = msg.getMixerContractConfig()) && proto.confio.poe.v1beta1.MixerContractConfig.toObject(includeInstance, f)
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
 * @return {!proto.confio.poe.v1beta1.SeedContracts}
 */
proto.confio.poe.v1beta1.SeedContracts.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.confio.poe.v1beta1.SeedContracts;
  return proto.confio.poe.v1beta1.SeedContracts.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.confio.poe.v1beta1.SeedContracts} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.confio.poe.v1beta1.SeedContracts}
 */
proto.confio.poe.v1beta1.SeedContracts.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.addGenTxs(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setBootstrapAccountAddress(value);
      break;
    case 3:
      var value = new proto.confio.poe.v1beta1.TG4Member;
      reader.readMessage(value,proto.confio.poe.v1beta1.TG4Member.deserializeBinaryFromReader);
      msg.addEngagement(value);
      break;
    case 4:
      var value = new proto.confio.poe.v1beta1.StakeContractConfig;
      reader.readMessage(value,proto.confio.poe.v1beta1.StakeContractConfig.deserializeBinaryFromReader);
      msg.setStakeContractConfig(value);
      break;
    case 5:
      var value = new proto.confio.poe.v1beta1.ValsetContractConfig;
      reader.readMessage(value,proto.confio.poe.v1beta1.ValsetContractConfig.deserializeBinaryFromReader);
      msg.setValsetContractConfig(value);
      break;
    case 6:
      var value = new proto.confio.poe.v1beta1.EngagementContractConfig;
      reader.readMessage(value,proto.confio.poe.v1beta1.EngagementContractConfig.deserializeBinaryFromReader);
      msg.setEngagementContractConfig(value);
      break;
    case 7:
      var value = /** @type {string} */ (reader.readString());
      msg.setBondDenom(value);
      break;
    case 8:
      var value = new proto.confio.poe.v1beta1.OversightCommitteeContractConfig;
      reader.readMessage(value,proto.confio.poe.v1beta1.OversightCommitteeContractConfig.deserializeBinaryFromReader);
      msg.setOversightCommitteeContractConfig(value);
      break;
    case 9:
      var value = new proto.confio.poe.v1beta1.CommunityPoolContractConfig;
      reader.readMessage(value,proto.confio.poe.v1beta1.CommunityPoolContractConfig.deserializeBinaryFromReader);
      msg.setCommunityPoolContractConfig(value);
      break;
    case 10:
      var value = new proto.confio.poe.v1beta1.ValidatorVotingContractConfig;
      reader.readMessage(value,proto.confio.poe.v1beta1.ValidatorVotingContractConfig.deserializeBinaryFromReader);
      msg.setValidatorVotingContractConfig(value);
      break;
    case 11:
      var value = /** @type {string} */ (reader.readString());
      msg.addOversightCommunityMembers(value);
      break;
    case 12:
      var value = /** @type {string} */ (reader.readString());
      msg.addArbiterPoolMembers(value);
      break;
    case 13:
      var value = new proto.confio.poe.v1beta1.ArbiterPoolContractConfig;
      reader.readMessage(value,proto.confio.poe.v1beta1.ArbiterPoolContractConfig.deserializeBinaryFromReader);
      msg.setArbiterPoolContractConfig(value);
      break;
    case 14:
      var value = new proto.confio.poe.v1beta1.MixerContractConfig;
      reader.readMessage(value,proto.confio.poe.v1beta1.MixerContractConfig.deserializeBinaryFromReader);
      msg.setMixerContractConfig(value);
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
proto.confio.poe.v1beta1.SeedContracts.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.confio.poe.v1beta1.SeedContracts.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.confio.poe.v1beta1.SeedContracts} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.confio.poe.v1beta1.SeedContracts.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getGenTxsList_asU8();
  if (f.length > 0) {
    writer.writeRepeatedBytes(
      1,
      f
    );
  }
  f = message.getBootstrapAccountAddress();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getEngagementList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      3,
      f,
      proto.confio.poe.v1beta1.TG4Member.serializeBinaryToWriter
    );
  }
  f = message.getStakeContractConfig();
  if (f != null) {
    writer.writeMessage(
      4,
      f,
      proto.confio.poe.v1beta1.StakeContractConfig.serializeBinaryToWriter
    );
  }
  f = message.getValsetContractConfig();
  if (f != null) {
    writer.writeMessage(
      5,
      f,
      proto.confio.poe.v1beta1.ValsetContractConfig.serializeBinaryToWriter
    );
  }
  f = message.getEngagementContractConfig();
  if (f != null) {
    writer.writeMessage(
      6,
      f,
      proto.confio.poe.v1beta1.EngagementContractConfig.serializeBinaryToWriter
    );
  }
  f = message.getBondDenom();
  if (f.length > 0) {
    writer.writeString(
      7,
      f
    );
  }
  f = message.getOversightCommitteeContractConfig();
  if (f != null) {
    writer.writeMessage(
      8,
      f,
      proto.confio.poe.v1beta1.OversightCommitteeContractConfig.serializeBinaryToWriter
    );
  }
  f = message.getCommunityPoolContractConfig();
  if (f != null) {
    writer.writeMessage(
      9,
      f,
      proto.confio.poe.v1beta1.CommunityPoolContractConfig.serializeBinaryToWriter
    );
  }
  f = message.getValidatorVotingContractConfig();
  if (f != null) {
    writer.writeMessage(
      10,
      f,
      proto.confio.poe.v1beta1.ValidatorVotingContractConfig.serializeBinaryToWriter
    );
  }
  f = message.getOversightCommunityMembersList();
  if (f.length > 0) {
    writer.writeRepeatedString(
      11,
      f
    );
  }
  f = message.getArbiterPoolMembersList();
  if (f.length > 0) {
    writer.writeRepeatedString(
      12,
      f
    );
  }
  f = message.getArbiterPoolContractConfig();
  if (f != null) {
    writer.writeMessage(
      13,
      f,
      proto.confio.poe.v1beta1.ArbiterPoolContractConfig.serializeBinaryToWriter
    );
  }
  f = message.getMixerContractConfig();
  if (f != null) {
    writer.writeMessage(
      14,
      f,
      proto.confio.poe.v1beta1.MixerContractConfig.serializeBinaryToWriter
    );
  }
};


/**
 * repeated bytes gen_txs = 1;
 * @return {!Array<string>}
 */
proto.confio.poe.v1beta1.SeedContracts.prototype.getGenTxsList = function() {
  return /** @type {!Array<string>} */ (jspb.Message.getRepeatedField(this, 1));
};


/**
 * repeated bytes gen_txs = 1;
 * This is a type-conversion wrapper around `getGenTxsList()`
 * @return {!Array<string>}
 */
proto.confio.poe.v1beta1.SeedContracts.prototype.getGenTxsList_asB64 = function() {
  return /** @type {!Array<string>} */ (jspb.Message.bytesListAsB64(
      this.getGenTxsList()));
};


/**
 * repeated bytes gen_txs = 1;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getGenTxsList()`
 * @return {!Array<!Uint8Array>}
 */
proto.confio.poe.v1beta1.SeedContracts.prototype.getGenTxsList_asU8 = function() {
  return /** @type {!Array<!Uint8Array>} */ (jspb.Message.bytesListAsU8(
      this.getGenTxsList()));
};


/**
 * @param {!(Array<!Uint8Array>|Array<string>)} value
 * @return {!proto.confio.poe.v1beta1.SeedContracts} returns this
 */
proto.confio.poe.v1beta1.SeedContracts.prototype.setGenTxsList = function(value) {
  return jspb.Message.setField(this, 1, value || []);
};


/**
 * @param {!(string|Uint8Array)} value
 * @param {number=} opt_index
 * @return {!proto.confio.poe.v1beta1.SeedContracts} returns this
 */
proto.confio.poe.v1beta1.SeedContracts.prototype.addGenTxs = function(value, opt_index) {
  return jspb.Message.addToRepeatedField(this, 1, value, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.confio.poe.v1beta1.SeedContracts} returns this
 */
proto.confio.poe.v1beta1.SeedContracts.prototype.clearGenTxsList = function() {
  return this.setGenTxsList([]);
};


/**
 * optional string bootstrap_account_address = 2;
 * @return {string}
 */
proto.confio.poe.v1beta1.SeedContracts.prototype.getBootstrapAccountAddress = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.confio.poe.v1beta1.SeedContracts} returns this
 */
proto.confio.poe.v1beta1.SeedContracts.prototype.setBootstrapAccountAddress = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * repeated TG4Member engagement = 3;
 * @return {!Array<!proto.confio.poe.v1beta1.TG4Member>}
 */
proto.confio.poe.v1beta1.SeedContracts.prototype.getEngagementList = function() {
  return /** @type{!Array<!proto.confio.poe.v1beta1.TG4Member>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.confio.poe.v1beta1.TG4Member, 3));
};


/**
 * @param {!Array<!proto.confio.poe.v1beta1.TG4Member>} value
 * @return {!proto.confio.poe.v1beta1.SeedContracts} returns this
*/
proto.confio.poe.v1beta1.SeedContracts.prototype.setEngagementList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 3, value);
};


/**
 * @param {!proto.confio.poe.v1beta1.TG4Member=} opt_value
 * @param {number=} opt_index
 * @return {!proto.confio.poe.v1beta1.TG4Member}
 */
proto.confio.poe.v1beta1.SeedContracts.prototype.addEngagement = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 3, opt_value, proto.confio.poe.v1beta1.TG4Member, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.confio.poe.v1beta1.SeedContracts} returns this
 */
proto.confio.poe.v1beta1.SeedContracts.prototype.clearEngagementList = function() {
  return this.setEngagementList([]);
};


/**
 * optional StakeContractConfig stake_contract_config = 4;
 * @return {?proto.confio.poe.v1beta1.StakeContractConfig}
 */
proto.confio.poe.v1beta1.SeedContracts.prototype.getStakeContractConfig = function() {
  return /** @type{?proto.confio.poe.v1beta1.StakeContractConfig} */ (
    jspb.Message.getWrapperField(this, proto.confio.poe.v1beta1.StakeContractConfig, 4));
};


/**
 * @param {?proto.confio.poe.v1beta1.StakeContractConfig|undefined} value
 * @return {!proto.confio.poe.v1beta1.SeedContracts} returns this
*/
proto.confio.poe.v1beta1.SeedContracts.prototype.setStakeContractConfig = function(value) {
  return jspb.Message.setWrapperField(this, 4, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.confio.poe.v1beta1.SeedContracts} returns this
 */
proto.confio.poe.v1beta1.SeedContracts.prototype.clearStakeContractConfig = function() {
  return this.setStakeContractConfig(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.confio.poe.v1beta1.SeedContracts.prototype.hasStakeContractConfig = function() {
  return jspb.Message.getField(this, 4) != null;
};


/**
 * optional ValsetContractConfig valset_contract_config = 5;
 * @return {?proto.confio.poe.v1beta1.ValsetContractConfig}
 */
proto.confio.poe.v1beta1.SeedContracts.prototype.getValsetContractConfig = function() {
  return /** @type{?proto.confio.poe.v1beta1.ValsetContractConfig} */ (
    jspb.Message.getWrapperField(this, proto.confio.poe.v1beta1.ValsetContractConfig, 5));
};


/**
 * @param {?proto.confio.poe.v1beta1.ValsetContractConfig|undefined} value
 * @return {!proto.confio.poe.v1beta1.SeedContracts} returns this
*/
proto.confio.poe.v1beta1.SeedContracts.prototype.setValsetContractConfig = function(value) {
  return jspb.Message.setWrapperField(this, 5, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.confio.poe.v1beta1.SeedContracts} returns this
 */
proto.confio.poe.v1beta1.SeedContracts.prototype.clearValsetContractConfig = function() {
  return this.setValsetContractConfig(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.confio.poe.v1beta1.SeedContracts.prototype.hasValsetContractConfig = function() {
  return jspb.Message.getField(this, 5) != null;
};


/**
 * optional EngagementContractConfig engagement_contract_config = 6;
 * @return {?proto.confio.poe.v1beta1.EngagementContractConfig}
 */
proto.confio.poe.v1beta1.SeedContracts.prototype.getEngagementContractConfig = function() {
  return /** @type{?proto.confio.poe.v1beta1.EngagementContractConfig} */ (
    jspb.Message.getWrapperField(this, proto.confio.poe.v1beta1.EngagementContractConfig, 6));
};


/**
 * @param {?proto.confio.poe.v1beta1.EngagementContractConfig|undefined} value
 * @return {!proto.confio.poe.v1beta1.SeedContracts} returns this
*/
proto.confio.poe.v1beta1.SeedContracts.prototype.setEngagementContractConfig = function(value) {
  return jspb.Message.setWrapperField(this, 6, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.confio.poe.v1beta1.SeedContracts} returns this
 */
proto.confio.poe.v1beta1.SeedContracts.prototype.clearEngagementContractConfig = function() {
  return this.setEngagementContractConfig(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.confio.poe.v1beta1.SeedContracts.prototype.hasEngagementContractConfig = function() {
  return jspb.Message.getField(this, 6) != null;
};


/**
 * optional string bond_denom = 7;
 * @return {string}
 */
proto.confio.poe.v1beta1.SeedContracts.prototype.getBondDenom = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 7, ""));
};


/**
 * @param {string} value
 * @return {!proto.confio.poe.v1beta1.SeedContracts} returns this
 */
proto.confio.poe.v1beta1.SeedContracts.prototype.setBondDenom = function(value) {
  return jspb.Message.setProto3StringField(this, 7, value);
};


/**
 * optional OversightCommitteeContractConfig oversight_committee_contract_config = 8;
 * @return {?proto.confio.poe.v1beta1.OversightCommitteeContractConfig}
 */
proto.confio.poe.v1beta1.SeedContracts.prototype.getOversightCommitteeContractConfig = function() {
  return /** @type{?proto.confio.poe.v1beta1.OversightCommitteeContractConfig} */ (
    jspb.Message.getWrapperField(this, proto.confio.poe.v1beta1.OversightCommitteeContractConfig, 8));
};


/**
 * @param {?proto.confio.poe.v1beta1.OversightCommitteeContractConfig|undefined} value
 * @return {!proto.confio.poe.v1beta1.SeedContracts} returns this
*/
proto.confio.poe.v1beta1.SeedContracts.prototype.setOversightCommitteeContractConfig = function(value) {
  return jspb.Message.setWrapperField(this, 8, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.confio.poe.v1beta1.SeedContracts} returns this
 */
proto.confio.poe.v1beta1.SeedContracts.prototype.clearOversightCommitteeContractConfig = function() {
  return this.setOversightCommitteeContractConfig(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.confio.poe.v1beta1.SeedContracts.prototype.hasOversightCommitteeContractConfig = function() {
  return jspb.Message.getField(this, 8) != null;
};


/**
 * optional CommunityPoolContractConfig community_pool_contract_config = 9;
 * @return {?proto.confio.poe.v1beta1.CommunityPoolContractConfig}
 */
proto.confio.poe.v1beta1.SeedContracts.prototype.getCommunityPoolContractConfig = function() {
  return /** @type{?proto.confio.poe.v1beta1.CommunityPoolContractConfig} */ (
    jspb.Message.getWrapperField(this, proto.confio.poe.v1beta1.CommunityPoolContractConfig, 9));
};


/**
 * @param {?proto.confio.poe.v1beta1.CommunityPoolContractConfig|undefined} value
 * @return {!proto.confio.poe.v1beta1.SeedContracts} returns this
*/
proto.confio.poe.v1beta1.SeedContracts.prototype.setCommunityPoolContractConfig = function(value) {
  return jspb.Message.setWrapperField(this, 9, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.confio.poe.v1beta1.SeedContracts} returns this
 */
proto.confio.poe.v1beta1.SeedContracts.prototype.clearCommunityPoolContractConfig = function() {
  return this.setCommunityPoolContractConfig(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.confio.poe.v1beta1.SeedContracts.prototype.hasCommunityPoolContractConfig = function() {
  return jspb.Message.getField(this, 9) != null;
};


/**
 * optional ValidatorVotingContractConfig validator_voting_contract_config = 10;
 * @return {?proto.confio.poe.v1beta1.ValidatorVotingContractConfig}
 */
proto.confio.poe.v1beta1.SeedContracts.prototype.getValidatorVotingContractConfig = function() {
  return /** @type{?proto.confio.poe.v1beta1.ValidatorVotingContractConfig} */ (
    jspb.Message.getWrapperField(this, proto.confio.poe.v1beta1.ValidatorVotingContractConfig, 10));
};


/**
 * @param {?proto.confio.poe.v1beta1.ValidatorVotingContractConfig|undefined} value
 * @return {!proto.confio.poe.v1beta1.SeedContracts} returns this
*/
proto.confio.poe.v1beta1.SeedContracts.prototype.setValidatorVotingContractConfig = function(value) {
  return jspb.Message.setWrapperField(this, 10, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.confio.poe.v1beta1.SeedContracts} returns this
 */
proto.confio.poe.v1beta1.SeedContracts.prototype.clearValidatorVotingContractConfig = function() {
  return this.setValidatorVotingContractConfig(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.confio.poe.v1beta1.SeedContracts.prototype.hasValidatorVotingContractConfig = function() {
  return jspb.Message.getField(this, 10) != null;
};


/**
 * repeated string oversight_community_members = 11;
 * @return {!Array<string>}
 */
proto.confio.poe.v1beta1.SeedContracts.prototype.getOversightCommunityMembersList = function() {
  return /** @type {!Array<string>} */ (jspb.Message.getRepeatedField(this, 11));
};


/**
 * @param {!Array<string>} value
 * @return {!proto.confio.poe.v1beta1.SeedContracts} returns this
 */
proto.confio.poe.v1beta1.SeedContracts.prototype.setOversightCommunityMembersList = function(value) {
  return jspb.Message.setField(this, 11, value || []);
};


/**
 * @param {string} value
 * @param {number=} opt_index
 * @return {!proto.confio.poe.v1beta1.SeedContracts} returns this
 */
proto.confio.poe.v1beta1.SeedContracts.prototype.addOversightCommunityMembers = function(value, opt_index) {
  return jspb.Message.addToRepeatedField(this, 11, value, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.confio.poe.v1beta1.SeedContracts} returns this
 */
proto.confio.poe.v1beta1.SeedContracts.prototype.clearOversightCommunityMembersList = function() {
  return this.setOversightCommunityMembersList([]);
};


/**
 * repeated string arbiter_pool_members = 12;
 * @return {!Array<string>}
 */
proto.confio.poe.v1beta1.SeedContracts.prototype.getArbiterPoolMembersList = function() {
  return /** @type {!Array<string>} */ (jspb.Message.getRepeatedField(this, 12));
};


/**
 * @param {!Array<string>} value
 * @return {!proto.confio.poe.v1beta1.SeedContracts} returns this
 */
proto.confio.poe.v1beta1.SeedContracts.prototype.setArbiterPoolMembersList = function(value) {
  return jspb.Message.setField(this, 12, value || []);
};


/**
 * @param {string} value
 * @param {number=} opt_index
 * @return {!proto.confio.poe.v1beta1.SeedContracts} returns this
 */
proto.confio.poe.v1beta1.SeedContracts.prototype.addArbiterPoolMembers = function(value, opt_index) {
  return jspb.Message.addToRepeatedField(this, 12, value, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.confio.poe.v1beta1.SeedContracts} returns this
 */
proto.confio.poe.v1beta1.SeedContracts.prototype.clearArbiterPoolMembersList = function() {
  return this.setArbiterPoolMembersList([]);
};


/**
 * optional ArbiterPoolContractConfig arbiter_pool_contract_config = 13;
 * @return {?proto.confio.poe.v1beta1.ArbiterPoolContractConfig}
 */
proto.confio.poe.v1beta1.SeedContracts.prototype.getArbiterPoolContractConfig = function() {
  return /** @type{?proto.confio.poe.v1beta1.ArbiterPoolContractConfig} */ (
    jspb.Message.getWrapperField(this, proto.confio.poe.v1beta1.ArbiterPoolContractConfig, 13));
};


/**
 * @param {?proto.confio.poe.v1beta1.ArbiterPoolContractConfig|undefined} value
 * @return {!proto.confio.poe.v1beta1.SeedContracts} returns this
*/
proto.confio.poe.v1beta1.SeedContracts.prototype.setArbiterPoolContractConfig = function(value) {
  return jspb.Message.setWrapperField(this, 13, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.confio.poe.v1beta1.SeedContracts} returns this
 */
proto.confio.poe.v1beta1.SeedContracts.prototype.clearArbiterPoolContractConfig = function() {
  return this.setArbiterPoolContractConfig(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.confio.poe.v1beta1.SeedContracts.prototype.hasArbiterPoolContractConfig = function() {
  return jspb.Message.getField(this, 13) != null;
};


/**
 * optional MixerContractConfig mixer_contract_config = 14;
 * @return {?proto.confio.poe.v1beta1.MixerContractConfig}
 */
proto.confio.poe.v1beta1.SeedContracts.prototype.getMixerContractConfig = function() {
  return /** @type{?proto.confio.poe.v1beta1.MixerContractConfig} */ (
    jspb.Message.getWrapperField(this, proto.confio.poe.v1beta1.MixerContractConfig, 14));
};


/**
 * @param {?proto.confio.poe.v1beta1.MixerContractConfig|undefined} value
 * @return {!proto.confio.poe.v1beta1.SeedContracts} returns this
*/
proto.confio.poe.v1beta1.SeedContracts.prototype.setMixerContractConfig = function(value) {
  return jspb.Message.setWrapperField(this, 14, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.confio.poe.v1beta1.SeedContracts} returns this
 */
proto.confio.poe.v1beta1.SeedContracts.prototype.clearMixerContractConfig = function() {
  return this.setMixerContractConfig(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.confio.poe.v1beta1.SeedContracts.prototype.hasMixerContractConfig = function() {
  return jspb.Message.getField(this, 14) != null;
};


