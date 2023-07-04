# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
"""Client and server classes corresponding to protobuf-defined services."""
import grpc

from panacea.datadeal.v2alpha2 import query_pb2 as panacea_dot_datadeal_dot_v2alpha2_dot_query__pb2


class QueryStub(object):
    """Query defines the gRPC querier service.
    """

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.Deal = channel.unary_unary(
                '/panacea.datadeal.v2alpha2.Query/Deal',
                request_serializer=panacea_dot_datadeal_dot_v2alpha2_dot_query__pb2.QueryDealRequest.SerializeToString,
                response_deserializer=panacea_dot_datadeal_dot_v2alpha2_dot_query__pb2.QueryDealResponse.FromString,
                )
        self.Deals = channel.unary_unary(
                '/panacea.datadeal.v2alpha2.Query/Deals',
                request_serializer=panacea_dot_datadeal_dot_v2alpha2_dot_query__pb2.QueryDealsRequest.SerializeToString,
                response_deserializer=panacea_dot_datadeal_dot_v2alpha2_dot_query__pb2.QueryDealsResponse.FromString,
                )
        self.DataSale = channel.unary_unary(
                '/panacea.datadeal.v2alpha2.Query/DataSale',
                request_serializer=panacea_dot_datadeal_dot_v2alpha2_dot_query__pb2.QueryDataSaleRequest.SerializeToString,
                response_deserializer=panacea_dot_datadeal_dot_v2alpha2_dot_query__pb2.QueryDataSaleResponse.FromString,
                )
        self.DataSales = channel.unary_unary(
                '/panacea.datadeal.v2alpha2.Query/DataSales',
                request_serializer=panacea_dot_datadeal_dot_v2alpha2_dot_query__pb2.QueryDataSalesRequest.SerializeToString,
                response_deserializer=panacea_dot_datadeal_dot_v2alpha2_dot_query__pb2.QueryDataSalesResponse.FromString,
                )
        self.DataVerificationVote = channel.unary_unary(
                '/panacea.datadeal.v2alpha2.Query/DataVerificationVote',
                request_serializer=panacea_dot_datadeal_dot_v2alpha2_dot_query__pb2.QueryDataVerificationVoteRequest.SerializeToString,
                response_deserializer=panacea_dot_datadeal_dot_v2alpha2_dot_query__pb2.QueryDataVerificationVoteResponse.FromString,
                )
        self.DataDeliveryVote = channel.unary_unary(
                '/panacea.datadeal.v2alpha2.Query/DataDeliveryVote',
                request_serializer=panacea_dot_datadeal_dot_v2alpha2_dot_query__pb2.QueryDataDeliveryVoteRequest.SerializeToString,
                response_deserializer=panacea_dot_datadeal_dot_v2alpha2_dot_query__pb2.QueryDataDeliveryVoteResponse.FromString,
                )


class QueryServicer(object):
    """Query defines the gRPC querier service.
    """

    def Deal(self, request, context):
        """Deal returns a Deal.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def Deals(self, request, context):
        """Deals return a list of Deal.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def DataSale(self, request, context):
        """DataSale returns a DataSale.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def DataSales(self, request, context):
        """DataSales returns a list of DataSale.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def DataVerificationVote(self, request, context):
        """DataVerificationVote returns a DataVerificationVote.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def DataDeliveryVote(self, request, context):
        """DataDeliveryVote returns a DataDeliveryVote.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_QueryServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'Deal': grpc.unary_unary_rpc_method_handler(
                    servicer.Deal,
                    request_deserializer=panacea_dot_datadeal_dot_v2alpha2_dot_query__pb2.QueryDealRequest.FromString,
                    response_serializer=panacea_dot_datadeal_dot_v2alpha2_dot_query__pb2.QueryDealResponse.SerializeToString,
            ),
            'Deals': grpc.unary_unary_rpc_method_handler(
                    servicer.Deals,
                    request_deserializer=panacea_dot_datadeal_dot_v2alpha2_dot_query__pb2.QueryDealsRequest.FromString,
                    response_serializer=panacea_dot_datadeal_dot_v2alpha2_dot_query__pb2.QueryDealsResponse.SerializeToString,
            ),
            'DataSale': grpc.unary_unary_rpc_method_handler(
                    servicer.DataSale,
                    request_deserializer=panacea_dot_datadeal_dot_v2alpha2_dot_query__pb2.QueryDataSaleRequest.FromString,
                    response_serializer=panacea_dot_datadeal_dot_v2alpha2_dot_query__pb2.QueryDataSaleResponse.SerializeToString,
            ),
            'DataSales': grpc.unary_unary_rpc_method_handler(
                    servicer.DataSales,
                    request_deserializer=panacea_dot_datadeal_dot_v2alpha2_dot_query__pb2.QueryDataSalesRequest.FromString,
                    response_serializer=panacea_dot_datadeal_dot_v2alpha2_dot_query__pb2.QueryDataSalesResponse.SerializeToString,
            ),
            'DataVerificationVote': grpc.unary_unary_rpc_method_handler(
                    servicer.DataVerificationVote,
                    request_deserializer=panacea_dot_datadeal_dot_v2alpha2_dot_query__pb2.QueryDataVerificationVoteRequest.FromString,
                    response_serializer=panacea_dot_datadeal_dot_v2alpha2_dot_query__pb2.QueryDataVerificationVoteResponse.SerializeToString,
            ),
            'DataDeliveryVote': grpc.unary_unary_rpc_method_handler(
                    servicer.DataDeliveryVote,
                    request_deserializer=panacea_dot_datadeal_dot_v2alpha2_dot_query__pb2.QueryDataDeliveryVoteRequest.FromString,
                    response_serializer=panacea_dot_datadeal_dot_v2alpha2_dot_query__pb2.QueryDataDeliveryVoteResponse.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'panacea.datadeal.v2alpha2.Query', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))


 # This class is part of an EXPERIMENTAL API.
class Query(object):
    """Query defines the gRPC querier service.
    """

    @staticmethod
    def Deal(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/panacea.datadeal.v2alpha2.Query/Deal',
            panacea_dot_datadeal_dot_v2alpha2_dot_query__pb2.QueryDealRequest.SerializeToString,
            panacea_dot_datadeal_dot_v2alpha2_dot_query__pb2.QueryDealResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def Deals(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/panacea.datadeal.v2alpha2.Query/Deals',
            panacea_dot_datadeal_dot_v2alpha2_dot_query__pb2.QueryDealsRequest.SerializeToString,
            panacea_dot_datadeal_dot_v2alpha2_dot_query__pb2.QueryDealsResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def DataSale(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/panacea.datadeal.v2alpha2.Query/DataSale',
            panacea_dot_datadeal_dot_v2alpha2_dot_query__pb2.QueryDataSaleRequest.SerializeToString,
            panacea_dot_datadeal_dot_v2alpha2_dot_query__pb2.QueryDataSaleResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def DataSales(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/panacea.datadeal.v2alpha2.Query/DataSales',
            panacea_dot_datadeal_dot_v2alpha2_dot_query__pb2.QueryDataSalesRequest.SerializeToString,
            panacea_dot_datadeal_dot_v2alpha2_dot_query__pb2.QueryDataSalesResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def DataVerificationVote(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/panacea.datadeal.v2alpha2.Query/DataVerificationVote',
            panacea_dot_datadeal_dot_v2alpha2_dot_query__pb2.QueryDataVerificationVoteRequest.SerializeToString,
            panacea_dot_datadeal_dot_v2alpha2_dot_query__pb2.QueryDataVerificationVoteResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def DataDeliveryVote(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/panacea.datadeal.v2alpha2.Query/DataDeliveryVote',
            panacea_dot_datadeal_dot_v2alpha2_dot_query__pb2.QueryDataDeliveryVoteRequest.SerializeToString,
            panacea_dot_datadeal_dot_v2alpha2_dot_query__pb2.QueryDataDeliveryVoteResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)