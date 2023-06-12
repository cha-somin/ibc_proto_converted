// source: kava/earn/v1beta1/query.proto
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

goog.provide('proto.kava.earn.v1beta1.VaultResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');

goog.forwardDeclare('proto.kava.earn.v1beta1.StrategyType');
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
proto.kava.earn.v1beta1.VaultResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.kava.earn.v1beta1.VaultResponse.repeatedFields_, null);
};
goog.inherits(proto.kava.earn.v1beta1.VaultResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.kava.earn.v1beta1.VaultResponse.displayName = 'proto.kava.earn.v1beta1.VaultResponse';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.kava.earn.v1beta1.VaultResponse.repeatedFields_ = [2,4];



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
proto.kava.earn.v1beta1.VaultResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.kava.earn.v1beta1.VaultResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.kava.earn.v1beta1.VaultResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.kava.earn.v1beta1.VaultResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    denom: jspb.Message.getFieldWithDefault(msg, 1, ""),
    strategiesList: (f = jspb.Message.getRepeatedField(msg, 2)) == null ? undefined : f,
    isPrivateVault: jspb.Message.getBooleanFieldWithDefault(msg, 3, false),
    allowedDepositorsList: (f = jspb.Message.getRepeatedField(msg, 4)) == null ? undefined : f,
    totalShares: jspb.Message.getFieldWithDefault(msg, 5, ""),
    totalValue: jspb.Message.getFieldWithDefault(msg, 6, "")
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
 * @return {!proto.kava.earn.v1beta1.VaultResponse}
 */
proto.kava.earn.v1beta1.VaultResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.kava.earn.v1beta1.VaultResponse;
  return proto.kava.earn.v1beta1.VaultResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.kava.earn.v1beta1.VaultResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.kava.earn.v1beta1.VaultResponse}
 */
proto.kava.earn.v1beta1.VaultResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setDenom(value);
      break;
    case 2:
      var values = /** @type {!Array<!proto.kava.earn.v1beta1.StrategyType>} */ (reader.isDelimited() ? reader.readPackedEnum() : [reader.readEnum()]);
      for (var i = 0; i < values.length; i++) {
        msg.addStrategies(values[i]);
      }
      break;
    case 3:
      var value = /** @type {boolean} */ (reader.readBool());
      msg.setIsPrivateVault(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.addAllowedDepositors(value);
      break;
    case 5:
      var value = /** @type {string} */ (reader.readString());
      msg.setTotalShares(value);
      break;
    case 6:
      var value = /** @type {string} */ (reader.readString());
      msg.setTotalValue(value);
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
proto.kava.earn.v1beta1.VaultResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.kava.earn.v1beta1.VaultResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.kava.earn.v1beta1.VaultResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.kava.earn.v1beta1.VaultResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getDenom();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getStrategiesList();
  if (f.length > 0) {
    writer.writePackedEnum(
      2,
      f
    );
  }
  f = message.getIsPrivateVault();
  if (f) {
    writer.writeBool(
      3,
      f
    );
  }
  f = message.getAllowedDepositorsList();
  if (f.length > 0) {
    writer.writeRepeatedString(
      4,
      f
    );
  }
  f = message.getTotalShares();
  if (f.length > 0) {
    writer.writeString(
      5,
      f
    );
  }
  f = message.getTotalValue();
  if (f.length > 0) {
    writer.writeString(
      6,
      f
    );
  }
};


/**
 * optional string denom = 1;
 * @return {string}
 */
proto.kava.earn.v1beta1.VaultResponse.prototype.getDenom = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.kava.earn.v1beta1.VaultResponse} returns this
 */
proto.kava.earn.v1beta1.VaultResponse.prototype.setDenom = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * repeated StrategyType strategies = 2;
 * @return {!Array<!proto.kava.earn.v1beta1.StrategyType>}
 */
proto.kava.earn.v1beta1.VaultResponse.prototype.getStrategiesList = function() {
  return /** @type {!Array<!proto.kava.earn.v1beta1.StrategyType>} */ (jspb.Message.getRepeatedField(this, 2));
};


/**
 * @param {!Array<!proto.kava.earn.v1beta1.StrategyType>} value
 * @return {!proto.kava.earn.v1beta1.VaultResponse} returns this
 */
proto.kava.earn.v1beta1.VaultResponse.prototype.setStrategiesList = function(value) {
  return jspb.Message.setField(this, 2, value || []);
};


/**
 * @param {!proto.kava.earn.v1beta1.StrategyType} value
 * @param {number=} opt_index
 * @return {!proto.kava.earn.v1beta1.VaultResponse} returns this
 */
proto.kava.earn.v1beta1.VaultResponse.prototype.addStrategies = function(value, opt_index) {
  return jspb.Message.addToRepeatedField(this, 2, value, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.kava.earn.v1beta1.VaultResponse} returns this
 */
proto.kava.earn.v1beta1.VaultResponse.prototype.clearStrategiesList = function() {
  return this.setStrategiesList([]);
};


/**
 * optional bool is_private_vault = 3;
 * @return {boolean}
 */
proto.kava.earn.v1beta1.VaultResponse.prototype.getIsPrivateVault = function() {
  return /** @type {boolean} */ (jspb.Message.getBooleanFieldWithDefault(this, 3, false));
};


/**
 * @param {boolean} value
 * @return {!proto.kava.earn.v1beta1.VaultResponse} returns this
 */
proto.kava.earn.v1beta1.VaultResponse.prototype.setIsPrivateVault = function(value) {
  return jspb.Message.setProto3BooleanField(this, 3, value);
};


/**
 * repeated string allowed_depositors = 4;
 * @return {!Array<string>}
 */
proto.kava.earn.v1beta1.VaultResponse.prototype.getAllowedDepositorsList = function() {
  return /** @type {!Array<string>} */ (jspb.Message.getRepeatedField(this, 4));
};


/**
 * @param {!Array<string>} value
 * @return {!proto.kava.earn.v1beta1.VaultResponse} returns this
 */
proto.kava.earn.v1beta1.VaultResponse.prototype.setAllowedDepositorsList = function(value) {
  return jspb.Message.setField(this, 4, value || []);
};


/**
 * @param {string} value
 * @param {number=} opt_index
 * @return {!proto.kava.earn.v1beta1.VaultResponse} returns this
 */
proto.kava.earn.v1beta1.VaultResponse.prototype.addAllowedDepositors = function(value, opt_index) {
  return jspb.Message.addToRepeatedField(this, 4, value, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.kava.earn.v1beta1.VaultResponse} returns this
 */
proto.kava.earn.v1beta1.VaultResponse.prototype.clearAllowedDepositorsList = function() {
  return this.setAllowedDepositorsList([]);
};


/**
 * optional string total_shares = 5;
 * @return {string}
 */
proto.kava.earn.v1beta1.VaultResponse.prototype.getTotalShares = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 5, ""));
};


/**
 * @param {string} value
 * @return {!proto.kava.earn.v1beta1.VaultResponse} returns this
 */
proto.kava.earn.v1beta1.VaultResponse.prototype.setTotalShares = function(value) {
  return jspb.Message.setProto3StringField(this, 5, value);
};


/**
 * optional string total_value = 6;
 * @return {string}
 */
proto.kava.earn.v1beta1.VaultResponse.prototype.getTotalValue = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 6, ""));
};


/**
 * @param {string} value
 * @return {!proto.kava.earn.v1beta1.VaultResponse} returns this
 */
proto.kava.earn.v1beta1.VaultResponse.prototype.setTotalValue = function(value) {
  return jspb.Message.setProto3StringField(this, 6, value);
};


