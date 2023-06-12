# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
"""Client and server classes corresponding to protobuf-defined services."""
import grpc

from panacea.datadeal.v2alpha1 import tx_pb2 as panacea_dot_datadeal_dot_v2alpha1_dot_tx__pb2


class MsgStub(object):
    """Msg defines the Msg service.
    """

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.CreateDeal = channel.unary_unary(
                '/panacea.datadeal.v2alpha1.Msg/CreateDeal',
                request_serializer=panacea_dot_datadeal_dot_v2alpha1_dot_tx__pb2.MsgCreateDeal.SerializeToString,
                response_deserializer=panacea_dot_datadeal_dot_v2alpha1_dot_tx__pb2.MsgCreateDealResponse.FromString,
                )
        self.SellData = channel.unary_unary(
                '/panacea.datadeal.v2alpha1.Msg/SellData',
                request_serializer=panacea_dot_datadeal_dot_v2alpha1_dot_tx__pb2.MsgSellData.SerializeToString,
                response_deserializer=panacea_dot_datadeal_dot_v2alpha1_dot_tx__pb2.MsgSellDataResponse.FromString,
                )
        self.DeactivateDeal = channel.unary_unary(
                '/panacea.datadeal.v2alpha1.Msg/DeactivateDeal',
                request_serializer=panacea_dot_datadeal_dot_v2alpha1_dot_tx__pb2.MsgDeactivateDeal.SerializeToString,
                response_deserializer=panacea_dot_datadeal_dot_v2alpha1_dot_tx__pb2.MsgDeactivateDealResponse.FromString,
                )


class MsgServicer(object):
    """Msg defines the Msg service.
    """

    def CreateDeal(self, request, context):
        """CreateDeal defines a method for creating a deal.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def SellData(self, request, context):
        """SellData defines a method for selling a data.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def DeactivateDeal(self, request, context):
        """DeactivateDeal defines a method for deactivating a deal.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_MsgServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'CreateDeal': grpc.unary_unary_rpc_method_handler(
                    servicer.CreateDeal,
                    request_deserializer=panacea_dot_datadeal_dot_v2alpha1_dot_tx__pb2.MsgCreateDeal.FromString,
                    response_serializer=panacea_dot_datadeal_dot_v2alpha1_dot_tx__pb2.MsgCreateDealResponse.SerializeToString,
            ),
            'SellData': grpc.unary_unary_rpc_method_handler(
                    servicer.SellData,
                    request_deserializer=panacea_dot_datadeal_dot_v2alpha1_dot_tx__pb2.MsgSellData.FromString,
                    response_serializer=panacea_dot_datadeal_dot_v2alpha1_dot_tx__pb2.MsgSellDataResponse.SerializeToString,
            ),
            'DeactivateDeal': grpc.unary_unary_rpc_method_handler(
                    servicer.DeactivateDeal,
                    request_deserializer=panacea_dot_datadeal_dot_v2alpha1_dot_tx__pb2.MsgDeactivateDeal.FromString,
                    response_serializer=panacea_dot_datadeal_dot_v2alpha1_dot_tx__pb2.MsgDeactivateDealResponse.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'panacea.datadeal.v2alpha1.Msg', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))


 # This class is part of an EXPERIMENTAL API.
class Msg(object):
    """Msg defines the Msg service.
    """

    @staticmethod
    def CreateDeal(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/panacea.datadeal.v2alpha1.Msg/CreateDeal',
            panacea_dot_datadeal_dot_v2alpha1_dot_tx__pb2.MsgCreateDeal.SerializeToString,
            panacea_dot_datadeal_dot_v2alpha1_dot_tx__pb2.MsgCreateDealResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def SellData(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/panacea.datadeal.v2alpha1.Msg/SellData',
            panacea_dot_datadeal_dot_v2alpha1_dot_tx__pb2.MsgSellData.SerializeToString,
            panacea_dot_datadeal_dot_v2alpha1_dot_tx__pb2.MsgSellDataResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def DeactivateDeal(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/panacea.datadeal.v2alpha1.Msg/DeactivateDeal',
            panacea_dot_datadeal_dot_v2alpha1_dot_tx__pb2.MsgDeactivateDeal.SerializeToString,
            panacea_dot_datadeal_dot_v2alpha1_dot_tx__pb2.MsgDeactivateDealResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)
