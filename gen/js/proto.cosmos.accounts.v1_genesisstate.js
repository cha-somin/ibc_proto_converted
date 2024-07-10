// source: cosmos/accounts/v1/genesis.proto
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

goog.provide('proto.cosmos.accounts.v1.GenesisState');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.cosmos.accounts.v1.GenesisAccount');

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
proto.cosmos.accounts.v1.GenesisState = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.cosmos.accounts.v1.GenesisState.repeatedFields_, null);
};
goog.inherits(proto.cosmos.accounts.v1.GenesisState, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.cosmos.accounts.v1.GenesisState.displayName = 'proto.cosmos.accounts.v1.GenesisState';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.cosmos.accounts.v1.GenesisState.repeatedFields_ = [2];



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
proto.cosmos.accounts.v1.GenesisState.prototype.toObject = function(opt_includeInstance) {
  return proto.cosmos.accounts.v1.GenesisState.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.cosmos.accounts.v1.GenesisState} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cosmos.accounts.v1.GenesisState.toObject = function(includeInstance, msg) {
  var f, obj = {
    accountNumber: jspb.Message.getFieldWithDefault(msg, 1, 0),
    accountsList: jspb.Message.toObjectList(msg.getAccountsList(),
    proto.cosmos.accounts.v1.GenesisAccount.toObject, includeInstance)
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
 * @return {!proto.cosmos.accounts.v1.GenesisState}
 */
proto.cosmos.accounts.v1.GenesisState.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.cosmos.accounts.v1.GenesisState;
  return proto.cosmos.accounts.v1.GenesisState.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.cosmos.accounts.v1.GenesisState} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.cosmos.accounts.v1.GenesisState}
 */
proto.cosmos.accounts.v1.GenesisState.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setAccountNumber(value);
      break;
    case 2:
      var value = new proto.cosmos.accounts.v1.GenesisAccount;
      reader.readMessage(value,proto.cosmos.accounts.v1.GenesisAccount.deserializeBinaryFromReader);
      msg.addAccounts(value);
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
proto.cosmos.accounts.v1.GenesisState.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.cosmos.accounts.v1.GenesisState.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.cosmos.accounts.v1.GenesisState} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cosmos.accounts.v1.GenesisState.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getAccountNumber();
  if (f !== 0) {
    writer.writeUint64(
      1,
      f
    );
  }
  f = message.getAccountsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      2,
      f,
      proto.cosmos.accounts.v1.GenesisAccount.serializeBinaryToWriter
    );
  }
};


/**
 * optional uint64 account_number = 1;
 * @return {number}
 */
proto.cosmos.accounts.v1.GenesisState.prototype.getAccountNumber = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/**
 * @param {number} value
 * @return {!proto.cosmos.accounts.v1.GenesisState} returns this
 */
proto.cosmos.accounts.v1.GenesisState.prototype.setAccountNumber = function(value) {
  return jspb.Message.setProto3IntField(this, 1, value);
};


/**
 * repeated GenesisAccount accounts = 2;
 * @return {!Array<!proto.cosmos.accounts.v1.GenesisAccount>}
 */
proto.cosmos.accounts.v1.GenesisState.prototype.getAccountsList = function() {
  return /** @type{!Array<!proto.cosmos.accounts.v1.GenesisAccount>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.cosmos.accounts.v1.GenesisAccount, 2));
};


/**
 * @param {!Array<!proto.cosmos.accounts.v1.GenesisAccount>} value
 * @return {!proto.cosmos.accounts.v1.GenesisState} returns this
*/
proto.cosmos.accounts.v1.GenesisState.prototype.setAccountsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 2, value);
};


/**
 * @param {!proto.cosmos.accounts.v1.GenesisAccount=} opt_value
 * @param {number=} opt_index
 * @return {!proto.cosmos.accounts.v1.GenesisAccount}
 */
proto.cosmos.accounts.v1.GenesisState.prototype.addAccounts = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 2, opt_value, proto.cosmos.accounts.v1.GenesisAccount, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.cosmos.accounts.v1.GenesisState} returns this
 */
proto.cosmos.accounts.v1.GenesisState.prototype.clearAccountsList = function() {
  return this.setAccountsList([]);
};

