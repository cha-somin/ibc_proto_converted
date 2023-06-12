// source: cudos/nft/nft.proto
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

goog.provide('proto.cudosnode.cudosnode.nft.ApprovedAddresses');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Map');
goog.require('jspb.Message');
goog.require('proto.cudosnode.cudosnode.nft.ApprovedAddressesData');

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
proto.cudosnode.cudosnode.nft.ApprovedAddresses = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.cudosnode.cudosnode.nft.ApprovedAddresses, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.cudosnode.cudosnode.nft.ApprovedAddresses.displayName = 'proto.cudosnode.cudosnode.nft.ApprovedAddresses';
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
proto.cudosnode.cudosnode.nft.ApprovedAddresses.prototype.toObject = function(opt_includeInstance) {
  return proto.cudosnode.cudosnode.nft.ApprovedAddresses.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.cudosnode.cudosnode.nft.ApprovedAddresses} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cudosnode.cudosnode.nft.ApprovedAddresses.toObject = function(includeInstance, msg) {
  var f, obj = {
    approvedaddressesMap: (f = msg.getApprovedaddressesMap()) ? f.toObject(includeInstance, proto.cudosnode.cudosnode.nft.ApprovedAddressesData.toObject) : []
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
 * @return {!proto.cudosnode.cudosnode.nft.ApprovedAddresses}
 */
proto.cudosnode.cudosnode.nft.ApprovedAddresses.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.cudosnode.cudosnode.nft.ApprovedAddresses;
  return proto.cudosnode.cudosnode.nft.ApprovedAddresses.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.cudosnode.cudosnode.nft.ApprovedAddresses} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.cudosnode.cudosnode.nft.ApprovedAddresses}
 */
proto.cudosnode.cudosnode.nft.ApprovedAddresses.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = msg.getApprovedaddressesMap();
      reader.readMessage(value, function(message, reader) {
        jspb.Map.deserializeBinary(message, reader, jspb.BinaryReader.prototype.readString, jspb.BinaryReader.prototype.readMessage, proto.cudosnode.cudosnode.nft.ApprovedAddressesData.deserializeBinaryFromReader, "", new proto.cudosnode.cudosnode.nft.ApprovedAddressesData());
         });
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
proto.cudosnode.cudosnode.nft.ApprovedAddresses.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.cudosnode.cudosnode.nft.ApprovedAddresses.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.cudosnode.cudosnode.nft.ApprovedAddresses} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cudosnode.cudosnode.nft.ApprovedAddresses.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getApprovedaddressesMap(true);
  if (f && f.getLength() > 0) {
    f.serializeBinary(1, writer, jspb.BinaryWriter.prototype.writeString, jspb.BinaryWriter.prototype.writeMessage, proto.cudosnode.cudosnode.nft.ApprovedAddressesData.serializeBinaryToWriter);
  }
};


/**
 * map<string, ApprovedAddressesData> approvedAddresses = 1;
 * @param {boolean=} opt_noLazyCreate Do not create the map if
 * empty, instead returning `undefined`
 * @return {!jspb.Map<string,!proto.cudosnode.cudosnode.nft.ApprovedAddressesData>}
 */
proto.cudosnode.cudosnode.nft.ApprovedAddresses.prototype.getApprovedaddressesMap = function(opt_noLazyCreate) {
  return /** @type {!jspb.Map<string,!proto.cudosnode.cudosnode.nft.ApprovedAddressesData>} */ (
      jspb.Message.getMapField(this, 1, opt_noLazyCreate,
      proto.cudosnode.cudosnode.nft.ApprovedAddressesData));
};


/**
 * Clears values from the map. The map will be non-null.
 * @return {!proto.cudosnode.cudosnode.nft.ApprovedAddresses} returns this
 */
proto.cudosnode.cudosnode.nft.ApprovedAddresses.prototype.clearApprovedaddressesMap = function() {
  this.getApprovedaddressesMap().clear();
  return this;
};


