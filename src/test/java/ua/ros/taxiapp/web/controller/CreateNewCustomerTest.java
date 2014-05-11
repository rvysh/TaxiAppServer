//
//package ua.ros.taxiapp.web.controller;
//
//import static com.yummynoodlebar.rest.controller.fixture.RestDataFixtures.standardCustomerJSON;
//import org.mockito.Matchers;
//import org.junit.Before;
//import org.junit.Test;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.MockitoAnnotations;
//import org.springframework.http.MediaType;
//import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
//import org.springframework.test.web.servlet.MockMvc;
//
//
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
//import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;
//import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;
//import static org.mockito.Mockito.*;
//import ua.ros.taxiapp.domain.Customer;
//import ua.ros.taxiapp.services.CustomerService;
//
///**
// *
// * @author Ros
// */
//public class CreateNewCustomerTest {
//    
//  MockMvc mockMvc;
//
//  @InjectMocks
//  SiteController controller;
//
//  @Mock
//  CustomerService customerService;
//
//  @Before
//  public void setup() {
//    MockitoAnnotations.initMocks(this);
//
//    this.mockMvc = standaloneSetup(controller)
//            .setMessageConverters(new MappingJackson2HttpMessageConverter()).build();
//
//    when(customerService.createCustomer(any(Customer.class))).thenReturn(true);
//  }
//
//  //createOrder - validation?
//
//  @Test
//  public void thatCreateCustomerUsesHttpCreated() throws Exception {
//
//    this.mockMvc.perform(
//            post("/saveCustomer")
//                    .content(standardCustomerJSON())
//                    .contentType(MediaType.APPLICATION_JSON)
//                    .accept(MediaType.APPLICATION_JSON))
//            .andDo(print())
//            .andExpect(status().isCreated());
//  }
//
//  @Test
//  public void thatCreateOrderRendersAsJson() throws Exception {
//
//    this.mockMvc.perform(
//            post("/aggregators/orders")
//                    .content(standardOrderJSON())
//                    .contentType(MediaType.APPLICATION_JSON)
//                    .accept(MediaType.APPLICATION_JSON))
//              .andExpect(jsonPath("$.items['" + YUMMY_ITEM + "']").value(12))
//              .andExpect(jsonPath("$.key").value("f3512d26-72f6-4290-9265-63ad69eccc13"));
//  }
//
//  @Test
//  public void thatCreateOrderPassesLocationHeader() throws Exception {
//
//    this.mockMvc.perform(
//            post("/aggregators/orders")
//                    .content(standardOrderJSON())
//                    .contentType(MediaType.APPLICATION_JSON)
//                    .accept(MediaType.APPLICATION_JSON))
//            .andExpect(header().string("Location", Matchers.endsWith("/aggregators/orders/f3512d26-72f6-4290-9265-63ad69eccc13")));
//  }
//}
