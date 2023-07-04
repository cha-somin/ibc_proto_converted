// source: kyve/team/v1beta1/genesis.proto
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

goog.provide('proto.kyve.team.v1beta1.GenesisState');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.kyve.team.v1beta1.Authority');
goog.require('proto.kyve.team.v1beta1.TeamVestingAccount');

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
proto.kyve.team.v1beta1.GenesisState = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.kyve.team.v1beta1.GenesisState.repeatedFields_, null);
};
goog.inherits(proto.kyve.team.v1beta1.GenesisState, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.kyve.team.v1beta1.GenesisState.displayName = 'proto.kyve.team.v1beta1.GenesisState';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.kyve.team.v1beta1.GenesisState.repeatedFields_ = [3];



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
proto.kyve.team.v1beta1.GenesisState.prototype.toObject = function(opt_includeInstance) {
  return proto.kyve.team.v1beta1.GenesisState.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.kyve.team.v1beta1.GenesisState} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.kyve.team.v1beta1.GenesisState.toObject = function(includeInstance, msg) {
  var f, obj = {
    authority: (f = msg.getAuthority()) && proto.kyve.team.v1beta1.Authority.toObject(includeInstance, f),
    accountListList: jspb.Message.toObjectList(msg.getAccountListList(),
    proto.kyve.team.v1beta1.TeamVestingAccount.toObject, includeInstance),
    accountCount: jspb.Message.getFieldWithDefault(msg, 4, 0)
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
 * @return {!proto.kyve.team.v1beta1.GenesisState}
 */
proto.kyve.team.v1beta1.GenesisState.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.kyve.team.v1beta1.GenesisState;
  return proto.kyve.team.v1beta1.GenesisState.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.kyve.team.v1beta1.GenesisState} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.kyve.team.v1beta1.GenesisState}
 */
proto.kyve.team.v1beta1.GenesisState.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 2:
      var value = new proto.kyve.team.v1beta1.Authority;
      reader.readMessage(value,proto.kyve.team.v1beta1.Authority.deserializeBinaryFromReader);
      msg.setAuthority(value);
      break;
    case 3:
      var value = new proto.kyve.team.v1beta1.TeamVestingAccount;
      reader.readMessage(value,proto.kyve.team.v1beta1.TeamVestingAccount.deserializeBinaryFromReader);
      msg.addAccountList(value);
      break;
    case 4:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setAccountCount(value);
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
proto.kyve.team.v1beta1.GenesisState.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.kyve.team.v1beta1.GenesisState.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.kyve.team.v1beta1.GenesisState} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.kyve.team.v1beta1.GenesisState.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getAuthority();
  if (f != null) {
    writer.writeMessage(
      2,
      f,
      proto.kyve.team.v1beta1.Authority.serializeBinaryToWriter
    );
  }
  f = message.getAccountListList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      3,
      f,
      proto.kyve.team.v1beta1.TeamVestingAccount.serializeBinaryToWriter
    );
  }
  f = message.getAccountCount();
  if (f !== 0) {
    writer.writeUint64(
      4,
      f
    );
  }
};


/**
 * optional Authority authority = 2;
 * @return {?proto.kyve.team.v1beta1.Authority}
 */
proto.kyve.team.v1beta1.GenesisState.prototype.getAuthority = function() {
  return /** @type{?proto.kyve.team.v1beta1.Authority} */ (
    jspb.Message.getWrapperField(this, proto.kyve.team.v1beta1.Authority, 2));
};


/**
 * @param {?proto.kyve.team.v1beta1.Authority|undefined} value
 * @return {!proto.kyve.team.v1beta1.GenesisState} returns this
*/
proto.kyve.team.v1beta1.GenesisState.prototype.setAuthority = function(value) {
  return jspb.Message.setWrapperField(this, 2, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.kyve.team.v1beta1.GenesisState} returns this
 */
proto.kyve.team.v1beta1.GenesisState.prototype.clearAuthority = function() {
  return this.setAuthority(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.kyve.team.v1beta1.GenesisState.prototype.hasAuthority = function() {
  return jspb.Message.getField(this, 2) != null;
};


/**
 * repeated TeamVestingAccount account_list = 3;
 * @return {!Array<!proto.kyve.team.v1beta1.TeamVestingAccount>}
 */
proto.kyve.team.v1beta1.GenesisState.prototype.getAccountListList = function() {
  return /** @type{!Array<!proto.kyve.team.v1beta1.TeamVestingAccount>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.kyve.team.v1beta1.TeamVestingAccount, 3));
};


/**
 * @param {!Array<!proto.kyve.team.v1beta1.TeamVestingAccount>} value
 * @return {!proto.kyve.team.v1beta1.GenesisState} returns this
*/
proto.kyve.team.v1beta1.GenesisState.prototype.setAccountListList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 3, value);
};


/**
 * @param {!proto.kyve.team.v1beta1.TeamVestingAccount=} opt_value
 * @param {number=} opt_index
 * @return {!proto.kyve.team.v1beta1.TeamVestingAccount}
 */
proto.kyve.team.v1beta1.GenesisState.prototype.addAccountList = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 3, opt_value, proto.kyve.team.v1beta1.TeamVestingAccount, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.kyve.team.v1beta1.GenesisState} returns this
 */
proto.kyve.team.v1beta1.GenesisState.prototype.clearAccountListList = function() {
  return this.setAccountListList([]);
};


/**
 * optional uint64 account_count = 4;
 * @return {number}
 */
proto.kyve.team.v1beta1.GenesisState.prototype.getAccountCount = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 4, 0));
};


/**
 * @param {number} value
 * @return {!proto.kyve.team.v1beta1.GenesisState} returns this
 */
proto.kyve.team.v1beta1.GenesisState.prototype.setAccountCount = function(value) {
  return jspb.Message.setProto3IntField(this, 4, value);
};

