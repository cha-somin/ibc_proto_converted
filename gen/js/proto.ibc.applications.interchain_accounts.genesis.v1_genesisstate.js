// source: ibc/applications/interchain_accounts/genesis/v1/genesis.proto
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

goog.provide('proto.ibc.applications.interchain_accounts.genesis.v1.GenesisState');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.ibc.applications.interchain_accounts.genesis.v1.ControllerGenesisState');
goog.require('proto.ibc.applications.interchain_accounts.genesis.v1.HostGenesisState');

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
proto.ibc.applications.interchain_accounts.genesis.v1.GenesisState = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.ibc.applications.interchain_accounts.genesis.v1.GenesisState, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.ibc.applications.interchain_accounts.genesis.v1.GenesisState.displayName = 'proto.ibc.applications.interchain_accounts.genesis.v1.GenesisState';
}



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
proto.ibc.applications.interchain_accounts.genesis.v1.GenesisState.prototype.toObject = function(opt_includeInstance) {
  return proto.ibc.applications.interchain_accounts.genesis.v1.GenesisState.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.ibc.applications.interchain_accounts.genesis.v1.GenesisState} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.ibc.applications.interchain_accounts.genesis.v1.GenesisState.toObject = function(includeInstance, msg) {
  var f, obj = {
    controllerGenesisState: (f = msg.getControllerGenesisState()) && proto.ibc.applications.interchain_accounts.genesis.v1.ControllerGenesisState.toObject(includeInstance, f),
    hostGenesisState: (f = msg.getHostGenesisState()) && proto.ibc.applications.interchain_accounts.genesis.v1.HostGenesisState.toObject(includeInstance, f)
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
 * @return {!proto.ibc.applications.interchain_accounts.genesis.v1.GenesisState}
 */
proto.ibc.applications.interchain_accounts.genesis.v1.GenesisState.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.ibc.applications.interchain_accounts.genesis.v1.GenesisState;
  return proto.ibc.applications.interchain_accounts.genesis.v1.GenesisState.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.ibc.applications.interchain_accounts.genesis.v1.GenesisState} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.ibc.applications.interchain_accounts.genesis.v1.GenesisState}
 */
proto.ibc.applications.interchain_accounts.genesis.v1.GenesisState.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.ibc.applications.interchain_accounts.genesis.v1.ControllerGenesisState;
      reader.readMessage(value,proto.ibc.applications.interchain_accounts.genesis.v1.ControllerGenesisState.deserializeBinaryFromReader);
      msg.setControllerGenesisState(value);
      break;
    case 2:
      var value = new proto.ibc.applications.interchain_accounts.genesis.v1.HostGenesisState;
      reader.readMessage(value,proto.ibc.applications.interchain_accounts.genesis.v1.HostGenesisState.deserializeBinaryFromReader);
      msg.setHostGenesisState(value);
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
proto.ibc.applications.interchain_accounts.genesis.v1.GenesisState.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.ibc.applications.interchain_accounts.genesis.v1.GenesisState.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.ibc.applications.interchain_accounts.genesis.v1.GenesisState} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.ibc.applications.interchain_accounts.genesis.v1.GenesisState.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getControllerGenesisState();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.ibc.applications.interchain_accounts.genesis.v1.ControllerGenesisState.serializeBinaryToWriter
    );
  }
  f = message.getHostGenesisState();
  if (f != null) {
    writer.writeMessage(
      2,
      f,
      proto.ibc.applications.interchain_accounts.genesis.v1.HostGenesisState.serializeBinaryToWriter
    );
  }
};


/**
 * optional ControllerGenesisState controller_genesis_state = 1;
 * @return {?proto.ibc.applications.interchain_accounts.genesis.v1.ControllerGenesisState}
 */
proto.ibc.applications.interchain_accounts.genesis.v1.GenesisState.prototype.getControllerGenesisState = function() {
  return /** @type{?proto.ibc.applications.interchain_accounts.genesis.v1.ControllerGenesisState} */ (
    jspb.Message.getWrapperField(this, proto.ibc.applications.interchain_accounts.genesis.v1.ControllerGenesisState, 1));
};


/**
 * @param {?proto.ibc.applications.interchain_accounts.genesis.v1.ControllerGenesisState|undefined} value
 * @return {!proto.ibc.applications.interchain_accounts.genesis.v1.GenesisState} returns this
*/
proto.ibc.applications.interchain_accounts.genesis.v1.GenesisState.prototype.setControllerGenesisState = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.ibc.applications.interchain_accounts.genesis.v1.GenesisState} returns this
 */
proto.ibc.applications.interchain_accounts.genesis.v1.GenesisState.prototype.clearControllerGenesisState = function() {
  return this.setControllerGenesisState(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.ibc.applications.interchain_accounts.genesis.v1.GenesisState.prototype.hasControllerGenesisState = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * optional HostGenesisState host_genesis_state = 2;
 * @return {?proto.ibc.applications.interchain_accounts.genesis.v1.HostGenesisState}
 */
proto.ibc.applications.interchain_accounts.genesis.v1.GenesisState.prototype.getHostGenesisState = function() {
  return /** @type{?proto.ibc.applications.interchain_accounts.genesis.v1.HostGenesisState} */ (
    jspb.Message.getWrapperField(this, proto.ibc.applications.interchain_accounts.genesis.v1.HostGenesisState, 2));
};


/**
 * @param {?proto.ibc.applications.interchain_accounts.genesis.v1.HostGenesisState|undefined} value
 * @return {!proto.ibc.applications.interchain_accounts.genesis.v1.GenesisState} returns this
*/
proto.ibc.applications.interchain_accounts.genesis.v1.GenesisState.prototype.setHostGenesisState = function(value) {
  return jspb.Message.setWrapperField(this, 2, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.ibc.applications.interchain_accounts.genesis.v1.GenesisState} returns this
 */
proto.ibc.applications.interchain_accounts.genesis.v1.GenesisState.prototype.clearHostGenesisState = function() {
  return this.setHostGenesisState(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.ibc.applications.interchain_accounts.genesis.v1.GenesisState.prototype.hasHostGenesisState = function() {
  return jspb.Message.getField(this, 2) != null;
};


