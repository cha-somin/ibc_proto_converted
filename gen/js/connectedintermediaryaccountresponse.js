// source: osmosis/superfluid/query.proto
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

goog.provide('proto.osmosis.superfluid.ConnectedIntermediaryAccountResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.osmosis.superfluid.SuperfluidIntermediaryAccountInfo');

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
proto.osmosis.superfluid.ConnectedIntermediaryAccountResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.osmosis.superfluid.ConnectedIntermediaryAccountResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.osmosis.superfluid.ConnectedIntermediaryAccountResponse.displayName = 'proto.osmosis.superfluid.ConnectedIntermediaryAccountResponse';
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
proto.osmosis.superfluid.ConnectedIntermediaryAccountResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.osmosis.superfluid.ConnectedIntermediaryAccountResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.osmosis.superfluid.ConnectedIntermediaryAccountResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.osmosis.superfluid.ConnectedIntermediaryAccountResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    account: (f = msg.getAccount()) && proto.osmosis.superfluid.SuperfluidIntermediaryAccountInfo.toObject(includeInstance, f)
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
 * @return {!proto.osmosis.superfluid.ConnectedIntermediaryAccountResponse}
 */
proto.osmosis.superfluid.ConnectedIntermediaryAccountResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.osmosis.superfluid.ConnectedIntermediaryAccountResponse;
  return proto.osmosis.superfluid.ConnectedIntermediaryAccountResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.osmosis.superfluid.ConnectedIntermediaryAccountResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.osmosis.superfluid.ConnectedIntermediaryAccountResponse}
 */
proto.osmosis.superfluid.ConnectedIntermediaryAccountResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.osmosis.superfluid.SuperfluidIntermediaryAccountInfo;
      reader.readMessage(value,proto.osmosis.superfluid.SuperfluidIntermediaryAccountInfo.deserializeBinaryFromReader);
      msg.setAccount(value);
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
proto.osmosis.superfluid.ConnectedIntermediaryAccountResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.osmosis.superfluid.ConnectedIntermediaryAccountResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.osmosis.superfluid.ConnectedIntermediaryAccountResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.osmosis.superfluid.ConnectedIntermediaryAccountResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getAccount();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.osmosis.superfluid.SuperfluidIntermediaryAccountInfo.serializeBinaryToWriter
    );
  }
};


/**
 * optional SuperfluidIntermediaryAccountInfo account = 1;
 * @return {?proto.osmosis.superfluid.SuperfluidIntermediaryAccountInfo}
 */
proto.osmosis.superfluid.ConnectedIntermediaryAccountResponse.prototype.getAccount = function() {
  return /** @type{?proto.osmosis.superfluid.SuperfluidIntermediaryAccountInfo} */ (
    jspb.Message.getWrapperField(this, proto.osmosis.superfluid.SuperfluidIntermediaryAccountInfo, 1));
};


/**
 * @param {?proto.osmosis.superfluid.SuperfluidIntermediaryAccountInfo|undefined} value
 * @return {!proto.osmosis.superfluid.ConnectedIntermediaryAccountResponse} returns this
*/
proto.osmosis.superfluid.ConnectedIntermediaryAccountResponse.prototype.setAccount = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.osmosis.superfluid.ConnectedIntermediaryAccountResponse} returns this
 */
proto.osmosis.superfluid.ConnectedIntermediaryAccountResponse.prototype.clearAccount = function() {
  return this.setAccount(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.osmosis.superfluid.ConnectedIntermediaryAccountResponse.prototype.hasAccount = function() {
  return jspb.Message.getField(this, 1) != null;
};

