# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
"""Client and server classes corresponding to protobuf-defined services."""
import grpc

from em.buyback.v1 import query_pb2 as em_dot_buyback_dot_v1_dot_query__pb2


class QueryStub(object):
    """Missing associated documentation comment in .proto file."""

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.Balance = channel.unary_unary(
                '/em.buyback.v1.Query/Balance',
                request_serializer=em_dot_buyback_dot_v1_dot_query__pb2.QueryBalanceRequest.SerializeToString,
                response_deserializer=em_dot_buyback_dot_v1_dot_query__pb2.QueryBalanceResponse.FromString,
                )
        self.BuybackTime = channel.unary_unary(
                '/em.buyback.v1.Query/BuybackTime',
                request_serializer=em_dot_buyback_dot_v1_dot_query__pb2.QueryBuybackTimeRequest.SerializeToString,
                response_deserializer=em_dot_buyback_dot_v1_dot_query__pb2.QueryBuybackTimeResponse.FromString,
                )


class QueryServicer(object):
    """Missing associated documentation comment in .proto file."""

    def Balance(self, request, context):
        """Query for the current buyback balance
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def BuybackTime(self, request, context):
        """Query for buyback time periods
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_QueryServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'Balance': grpc.unary_unary_rpc_method_handler(
                    servicer.Balance,
                    request_deserializer=em_dot_buyback_dot_v1_dot_query__pb2.QueryBalanceRequest.FromString,
                    response_serializer=em_dot_buyback_dot_v1_dot_query__pb2.QueryBalanceResponse.SerializeToString,
            ),
            'BuybackTime': grpc.unary_unary_rpc_method_handler(
                    servicer.BuybackTime,
                    request_deserializer=em_dot_buyback_dot_v1_dot_query__pb2.QueryBuybackTimeRequest.FromString,
                    response_serializer=em_dot_buyback_dot_v1_dot_query__pb2.QueryBuybackTimeResponse.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'em.buyback.v1.Query', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))


 # This class is part of an EXPERIMENTAL API.
class Query(object):
    """Missing associated documentation comment in .proto file."""

    @staticmethod
    def Balance(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/em.buyback.v1.Query/Balance',
            em_dot_buyback_dot_v1_dot_query__pb2.QueryBalanceRequest.SerializeToString,
            em_dot_buyback_dot_v1_dot_query__pb2.QueryBalanceResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def BuybackTime(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/em.buyback.v1.Query/BuybackTime',
            em_dot_buyback_dot_v1_dot_query__pb2.QueryBuybackTimeRequest.SerializeToString,
            em_dot_buyback_dot_v1_dot_query__pb2.QueryBuybackTimeResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)
