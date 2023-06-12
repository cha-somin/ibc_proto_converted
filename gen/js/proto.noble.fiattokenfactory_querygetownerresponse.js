// source: noble/fiattokenfactory/query.proto
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

goog.provide('proto.noble.fiattokenfactory.QueryGetOwnerResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.noble.fiattokenfactory.Owner');

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
proto.noble.fiattokenfactory.QueryGetOwnerResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.noble.fiattokenfactory.QueryGetOwnerResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.noble.fiattokenfactory.QueryGetOwnerResponse.displayName = 'proto.noble.fiattokenfactory.QueryGetOwnerResponse';
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
proto.noble.fiattokenfactory.QueryGetOwnerResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.noble.fiattokenfactory.QueryGetOwnerResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.noble.fiattokenfactory.QueryGetOwnerResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.noble.fiattokenfactory.QueryGetOwnerResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    owner: (f = msg.getOwner()) && proto.noble.fiattokenfactory.Owner.toObject(includeInstance, f)
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
 * @return {!proto.noble.fiattokenfactory.QueryGetOwnerResponse}
 */
proto.noble.fiattokenfactory.QueryGetOwnerResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.noble.fiattokenfactory.QueryGetOwnerResponse;
  return proto.noble.fiattokenfactory.QueryGetOwnerResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.noble.fiattokenfactory.QueryGetOwnerResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.noble.fiattokenfactory.QueryGetOwnerResponse}
 */
proto.noble.fiattokenfactory.QueryGetOwnerResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.noble.fiattokenfactory.Owner;
      reader.readMessage(value,proto.noble.fiattokenfactory.Owner.deserializeBinaryFromReader);
      msg.setOwner(value);
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
proto.noble.fiattokenfactory.QueryGetOwnerResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.noble.fiattokenfactory.QueryGetOwnerResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.noble.fiattokenfactory.QueryGetOwnerResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.noble.fiattokenfactory.QueryGetOwnerResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getOwner();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.noble.fiattokenfactory.Owner.serializeBinaryToWriter
    );
  }
};


/**
 * optional Owner owner = 1;
 * @return {?proto.noble.fiattokenfactory.Owner}
 */
proto.noble.fiattokenfactory.QueryGetOwnerResponse.prototype.getOwner = function() {
  return /** @type{?proto.noble.fiattokenfactory.Owner} */ (
    jspb.Message.getWrapperField(this, proto.noble.fiattokenfactory.Owner, 1));
};


/**
 * @param {?proto.noble.fiattokenfactory.Owner|undefined} value
 * @return {!proto.noble.fiattokenfactory.QueryGetOwnerResponse} returns this
*/
proto.noble.fiattokenfactory.QueryGetOwnerResponse.prototype.setOwner = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.noble.fiattokenfactory.QueryGetOwnerResponse} returns this
 */
proto.noble.fiattokenfactory.QueryGetOwnerResponse.prototype.clearOwner = function() {
  return this.setOwner(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.noble.fiattokenfactory.QueryGetOwnerResponse.prototype.hasOwner = function() {
  return jspb.Message.getField(this, 1) != null;
};


