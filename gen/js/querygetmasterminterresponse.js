// source: noble/tokenfactory/query.proto
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

goog.provide('proto.noble.tokenfactory.QueryGetMasterMinterResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.noble.tokenfactory.MasterMinter');

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
proto.noble.tokenfactory.QueryGetMasterMinterResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.noble.tokenfactory.QueryGetMasterMinterResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.noble.tokenfactory.QueryGetMasterMinterResponse.displayName = 'proto.noble.tokenfactory.QueryGetMasterMinterResponse';
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
proto.noble.tokenfactory.QueryGetMasterMinterResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.noble.tokenfactory.QueryGetMasterMinterResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.noble.tokenfactory.QueryGetMasterMinterResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.noble.tokenfactory.QueryGetMasterMinterResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    masterminter: (f = msg.getMasterminter()) && proto.noble.tokenfactory.MasterMinter.toObject(includeInstance, f)
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
 * @return {!proto.noble.tokenfactory.QueryGetMasterMinterResponse}
 */
proto.noble.tokenfactory.QueryGetMasterMinterResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.noble.tokenfactory.QueryGetMasterMinterResponse;
  return proto.noble.tokenfactory.QueryGetMasterMinterResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.noble.tokenfactory.QueryGetMasterMinterResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.noble.tokenfactory.QueryGetMasterMinterResponse}
 */
proto.noble.tokenfactory.QueryGetMasterMinterResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.noble.tokenfactory.MasterMinter;
      reader.readMessage(value,proto.noble.tokenfactory.MasterMinter.deserializeBinaryFromReader);
      msg.setMasterminter(value);
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
proto.noble.tokenfactory.QueryGetMasterMinterResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.noble.tokenfactory.QueryGetMasterMinterResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.noble.tokenfactory.QueryGetMasterMinterResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.noble.tokenfactory.QueryGetMasterMinterResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getMasterminter();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.noble.tokenfactory.MasterMinter.serializeBinaryToWriter
    );
  }
};


/**
 * optional MasterMinter masterMinter = 1;
 * @return {?proto.noble.tokenfactory.MasterMinter}
 */
proto.noble.tokenfactory.QueryGetMasterMinterResponse.prototype.getMasterminter = function() {
  return /** @type{?proto.noble.tokenfactory.MasterMinter} */ (
    jspb.Message.getWrapperField(this, proto.noble.tokenfactory.MasterMinter, 1));
};


/**
 * @param {?proto.noble.tokenfactory.MasterMinter|undefined} value
 * @return {!proto.noble.tokenfactory.QueryGetMasterMinterResponse} returns this
*/
proto.noble.tokenfactory.QueryGetMasterMinterResponse.prototype.setMasterminter = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.noble.tokenfactory.QueryGetMasterMinterResponse} returns this
 */
proto.noble.tokenfactory.QueryGetMasterMinterResponse.prototype.clearMasterminter = function() {
  return this.setMasterminter(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.noble.tokenfactory.QueryGetMasterMinterResponse.prototype.hasMasterminter = function() {
  return jspb.Message.getField(this, 1) != null;
};


